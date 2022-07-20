package dto.udemy;

import java.util.ArrayList;
import java.util.List;

class Producer {
    private List<Integer> list = new ArrayList<>();
    private static final int UPPER_LIMIT = 5;
    private static final int LOWER_LIMIT = 0;
    private final Object lock = new Object();
    private int value = 0;

    public void producer() throws InterruptedException {
        synchronized (lock) {
            while (true) {
                if (list.size() == UPPER_LIMIT) {
                    System.out.println("waiting for removing items...");
                    lock.wait();
                } else {
                    System.out.println("Adding " + value);
                    list.add(value);
                    value++;
                    // we can call the notify -becz the other thread will be notifies
                    //only when it is in a waiting state.
                    lock.notify();

                }
            }
        }
    }

    public void consumer() throws InterruptedException {
        while (true) {
            if (list.size() == LOWER_LIMIT) {
                System.out.println("waiting for adding items...");
                lock.wait();
            } else {
                System.out.println("Removing " + value);
                list.remove(list.remove(list.size() - 1));

                lock.notify();

            }
        }
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        Processor processor = new Processor();
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    processor.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    processor.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();

    }
}

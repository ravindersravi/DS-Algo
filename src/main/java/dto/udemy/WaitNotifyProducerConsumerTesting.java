package dto.udemy;

import java.util.ArrayList;
import java.util.List;

class Processor {

    private List<Integer> list = new ArrayList<>();
    private static final int UPPER_LIMIT = 5;
    private static final int LOWER_LIMIT = 0;
    private final Object lock = new Object();
    private int value = 0;

    public void produce() throws InterruptedException {
        synchronized (lock) {
            while (true) {
                if (list.size() == UPPER_LIMIT) {
                    System.out.println("waiting for removing items...");
                    lock.wait();
                }
                else {
                    System.out.println("Adding :" + value);
                    list.add(value);
                    value++;
                    // we can call the nofity- because other thread will be notified
                    //only when it is in waiting state
                    lock.notify();
                }
                Thread.sleep(500);
            }
        }
    }

    public void consume() throws InterruptedException {
        synchronized (lock) {
            while (true) {
                if (list.size() == LOWER_LIMIT) {
                    System.out.println("waiting for adding items...");
                    value =0;
                    lock.wait();
                }
                else {
                    System.out.println("removing :" + list.remove(list.size() - 1));

                    // we can call the nofity- because other thread will be notified
                    //only when it is in waiting state
                    lock.notify();
                }
                Thread.sleep(500);
            }
        }
    }
}


public class WaitNotifyProducerConsumerTesting {
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

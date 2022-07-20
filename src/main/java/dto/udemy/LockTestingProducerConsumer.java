package dto.udemy;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Workers {

    private Lock lock = new ReentrantLock(true);
    private Condition condition = lock.newCondition();

    public void produce() throws InterruptedException {
        lock.lock();
        System.out.println("producer method..");
        //wait()
        condition.await();
        System.out.println("Again producer method");
        lock.unlock();
    }

    public void consume() throws InterruptedException {
        //we want to make sure that we start with the producer()
        Thread.sleep(2000);
        lock.lock();
        System.out.println("consumer method...");
        Thread.sleep(3000);
        condition.signal(); //notify()
        System.out.println("condition signal method executed..");
        lock.unlock();
    }
}

public class LockTestingProducerConsumer {
    public static void main(String[] args) {
        Workers worker = new Workers();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    worker.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    worker.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //stem.out.println(count);
    }
}

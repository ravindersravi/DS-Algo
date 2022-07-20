package dto.udemy;

import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockExample {
    private Lock lock1 = new ReentrantLock(true);
    private Lock lock2 = new ReentrantLock(true);

    public static void main(String[] args) {
   DeadLockExample example = new DeadLockExample();

   new Thread(example::worker1,"Worker-1").start();
   new Thread(example::worker2,"Worker-2").start();

    }
    @SneakyThrows
    public void worker1(){
        lock1.lock();
        System.out.println("Worker 1 acquires the lock1....");
            Thread.sleep(300);
        lock2.lock();
        System.out.println("WOrker1 acquired the lock2....");
        lock1.unlock();
        lock2.unlock();

    }
    @SneakyThrows
    public void worker2(){
        lock2.lock();
        System.out.println("Worker 1 acquires the lock2....");
        Thread.sleep(300);
        lock1.lock();
        System.out.println("WOrker2 acquired the lock1....");
        lock1.unlock();
        lock2.unlock();
    }
}

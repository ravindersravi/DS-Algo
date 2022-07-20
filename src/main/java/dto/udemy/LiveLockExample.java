package dto.udemy;

import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LiveLockExample {
    private Lock lock1 = new ReentrantLock(true);
    private Lock lock2 = new ReentrantLock(true);

    public static void main(String[] args) {
   LiveLockExample example = new LiveLockExample();

   new Thread(example::worker1,"Worker-1").start();
   new Thread(example::worker2,"Worker-2").start();

    }
    @SneakyThrows
    public void worker1(){
        while (true) {
            lock1.tryLock(50, TimeUnit.MILLISECONDS);
            System.out.println("Worker 1 acquires the lock1....");
            System.out.println("Worker 1 tries to get the lock2....");
        if(lock2.tryLock()){
            System.out.println("WOrker1 acquired the lock2....");
            lock2.unlock();
        }
        else {
            System.out.println("WOrker1 can not acquire the lock2....");

            continue;
        }
        break;
    }
        lock1.unlock();
        lock2.unlock();
    }
    @SneakyThrows
    public void worker2(){
        while (true) {
            lock2.tryLock(50, TimeUnit.MILLISECONDS);
            System.out.println("Worker 2 acquires the lock-2....");
            System.out.println("Worker 2 tries to get the lock-1....");
            if(lock1.tryLock()){
                System.out.println("WOrker2 acquired the lock-1....");
                lock1.unlock();
            }
            else {
                System.out.println("WOrker2 can not acquire the lock-1....");

                continue;
            }
            break;
        }
        lock1.unlock();
        lock2.unlock();
    }
}

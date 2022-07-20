package dto.udemy;


import lombok.SneakyThrows;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegers {
    private static AtomicInteger counter = new AtomicInteger(0);

    @SneakyThrows
    public static void main(String[] args) {
        AtomicIntegers atomic = new AtomicIntegers();
     //   new Thread(atomic::increment,"thread-1").start();
       // new Thread(atomic::increment,"thread-2").start();
        Thread t1= new Thread(()->{
            increment();
        });

        Thread t2= new Thread(()->{
            increment();
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("counter: "+counter);

    }
    public  static void increment() {
        for(int i=0;i<10000;i++)
        counter.incrementAndGet();
    }
}

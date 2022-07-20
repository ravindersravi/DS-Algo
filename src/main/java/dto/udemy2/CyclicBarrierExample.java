package dto.udemy2;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerBarrier implements Runnable {

    private int id;
    private Random random;
    private CyclicBarrier cyclicBarrier;

    public WorkerBarrier(int id, CyclicBarrier cyclicBarrier){
        this.id = id;
        this.random = new Random();
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
    doWork();
    }
    private void doWork() {
        System.out.println("Thread with ID " + this.id+ "starts the work...");
        try {
            Thread.sleep(random.nextInt(3000));
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        try {
            cyclicBarrier.await();
        } catch(InterruptedException | BrokenBarrierException e){
            e.printStackTrace();
        }
        System.out.println("After the await()...");
    }
}

public class CyclicBarrierExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        //Cyclic barrier: multiple threads are waiting for each other
        //latch--> single thread wait for other threads
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, ()->{
            System.out.println("ALl tasks have been finished.....");
        });
        for(int i=0;i<5;i++){
           executorService.execute(new WorkerBarrier(i+1, cyclicBarrier));
        }
        executorService.shutdown();
    }
}

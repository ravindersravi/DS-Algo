package dto.udemy2;


import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Tasks implements Runnable {

    private  int id;
    public Tasks(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Task with id: "+id +" is in work - thread id: "+Thread.currentThread().getName());
        long duration = (long) (Math.random()*5);
        try{
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
           Thread.currentThread().interrupt();
        }

    }


}

public class FixedThreadPool {

    public static void main(String[] args) {
        /*
        it is a single thread that will execute the tasks sequentially
        so one after another
         */
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for(int i=0;i<100;i++)
            executor.execute(new Tasks(i));
        //we prevent executor to execute any further tasks
        executor.shutdown();
        //terminate actual tasks
        try {
            if (!executor.awaitTermination(1000, TimeUnit.MILLISECONDS)) {
                executor.shutdownNow();
            }
        }catch (InterruptedException e) {
            executor.shutdownNow();        }
    }
}

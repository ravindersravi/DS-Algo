package dto.udemy2;
import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Tasks1 implements Runnable {

    private  int id;
    public Tasks1(int id) {
        this.id = id;
    }
    @SneakyThrows
    @Override
    public void run() {
        System.out.println("Task with id: "+id +" is in work - thread id: "+Thread.currentThread().getName());
        long duration = (long) (Math.random()*5);
        TimeUnit.SECONDS.sleep(duration);
    }


}


public class CatchedThreadPool {
    public static void main(String[] args) {
        /*
        it is a single thread that will execute the tasks sequentially
        so one after another
         */
        ExecutorService executor = Executors.newCachedThreadPool();
        for(int i=0;i<1000;i++)
            executor.execute(new Tasks1(i));
        executor.shutdown();
    }
}

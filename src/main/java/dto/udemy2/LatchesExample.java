package dto.udemy2;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerExamples implements Runnable {
    private int id;
    private CountDownLatch countDownLatch;

    public WorkerExamples(int id, CountDownLatch countDownLatch) {
        this.id = id;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        downWork();
        countDownLatch.countDown();
    }

    public void downWork() {
        try {
            System.out.println("Thread with ID " + this.id + " starts working...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class LatchesExample {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new WorkerExamples(i, countDownLatch));
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All tasks have been finished....");
        executorService.shutdown();
    }
}

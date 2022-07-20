package dto.udemy;

import lombok.SneakyThrows;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

enum Downloader{
    INSTANCE;
    private  Semaphore semaphore = new Semaphore(5, true);
    
    @SneakyThrows
    public void download(){
        semaphore.acquire();
        downloadData();
        semaphore.release();
    }

    @SneakyThrows
    private void downloadData() {
        System.out.println("Downloading data from the Web");

        Thread.sleep(2000);
    }
}


public class SemaphoreExample {
    /*
    IT is used to control access to a shared resource that uses a counter variable
    //semaphore maintains a set of permits
    -acquire()..if a permit is avaible then takes it.
    -release()..adds a permit

    Seamphore just keeps a count of the number of permits available
    new Semaphore(int permits, boolean fair) !!
     */
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        for(int i=0;i<12;i++){
            service.execute(()->{
                Downloader.INSTANCE.download();
            });
        }
    }
}

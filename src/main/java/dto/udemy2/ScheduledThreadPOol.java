package dto.udemy2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class StockMarketUpdator implements Runnable{


    @Override
    public void run() {
        System.out.println("updating and downloading stock from web...");
    }
}
public class ScheduledThreadPOol {
    public static void main(String[] args) {

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleAtFixedRate(new StockMarketUpdator(),1000,6000, TimeUnit.MILLISECONDS);
    }
}

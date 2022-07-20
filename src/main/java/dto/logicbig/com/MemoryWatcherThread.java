package dto.logicbig.com;

public class MemoryWatcherThread implements Runnable{
    public static void start(){
        Thread thread = new Thread(new MemoryWatcherThread());
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.setDaemon(true);
        thread.start();
    }
    @Override
    public void run(){
        long memoryUsed = getMemoryUsed();
        System.out.println("Memory used: "+ memoryUsed + "MB");
        while(true){

        }



    }
    private long getMemoryUsed(){
        return (Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory());
    }
}

package dto.udemy;

import lombok.SneakyThrows;

class WorkerVolatile implements Runnable {

    //it will be stored in main memory
    private volatile boolean terminated;
    @SneakyThrows(InterruptedException.class)
    @Override
    public void run() {
        while (!terminated){
            System.out.println("Working class is running...");

                Thread.sleep(500);
        }
    }
    public boolean isTerminated(){
        return terminated;
    }
    public void setTerminated(boolean terminated){
        this.terminated = terminated;
    }

}
public class VolatileExample {
    public static void main(String[] args) throws InterruptedException {
        WorkerVolatile WorkerVolatile = new WorkerVolatile();
        Thread t1 = new Thread(WorkerVolatile);
        t1.start();
        Thread.sleep(3000);
        WorkerVolatile.setTerminated(true);
        System.out.println("ÄLgorith is terminated!!!");

    }


}

package dto.udemy;

class DaemonWorker implements Runnable{

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Deamon thread running!");
        }
    }
}
class NonWorker implements Runnable{

    @Override
    public void run() {

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Normal  thread running!");
        }

}


public class DeamonJVMTermination {
    public static void main(String[] args) {
        Thread t1= new Thread(new DaemonWorker());
        Thread t2= new Thread(new NonWorker());
        t1.setDaemon(true);
        t1.start();
        t2.start();

    }
}

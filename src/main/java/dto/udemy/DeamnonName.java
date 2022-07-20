package dto.udemy;

class Worker implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello World from a given thread..");
    }
}
public class DeamnonName {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        Thread t1 = new Thread(new Worker());
        //creating daemon thread
                t1.setDaemon(true);
        System.out.println(t1.isDaemon());
;    }
}

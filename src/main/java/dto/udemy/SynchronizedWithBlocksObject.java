package dto.udemy;

public class SynchronizedWithBlocksObject {
    public static int count1 = 0;
    public static int count2 = 0;

    private  static final Object lock11 = new Object();
    private  static final Object lock12 = new Object();
// time slicing algorithm

    public static synchronized void increment1(){
        synchronized(lock11) {
            count1++;
        }
    }
    public static synchronized void increment2(){
        synchronized(lock12) {
            count2++;
        }
    }

    public static void process(){

        Thread t1= new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i=0; i<100;++i){
                    increment1();
                 /*   try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/
                }
            }
        });
        Thread t2= new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i=0; i<100;++i){
                    increment2();
                }
            }
        });
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("The counter value is "+count1);
        System.out.println("The counter value is "+count2);
    }
    public static void main(String[] args) {
        process();

    }
}

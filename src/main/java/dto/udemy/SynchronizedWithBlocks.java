package dto.udemy;

public class SynchronizedWithBlocks {
    public static int count1 = 0;
    public static int count2 = 0;

    /*
   It is recommended that use of synchronized blocks than synchronized
   methods.
     */
    public static synchronized void increment1(){
        synchronized(SynchronizedWithBlocks.class) {
            count1++;
        }
    }
    public static synchronized void increment2(){
        synchronized(SynchronizedWithBlocks.class) {
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

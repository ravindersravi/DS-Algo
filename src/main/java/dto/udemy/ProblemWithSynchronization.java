package dto.udemy;

public class ProblemWithSynchronization {
    public static int count1 = 0;
    public static int count2 = 0;

    /*
    here thread t1 acuires the lock on Problemswith synchronisation while executing
    the increament1(). so which will block thread to calling synchronized increament2() method even though both are indepemcent
     */
    public static synchronized void increment1(){
        count1++;
    }
    public static synchronized void increment2(){
        count2++;
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

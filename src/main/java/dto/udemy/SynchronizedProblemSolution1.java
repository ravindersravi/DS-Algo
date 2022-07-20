package dto.udemy;

public class SynchronizedProblemSolution1 {

    public static int counter1 = 0;
    public static int counter2 = 0;
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();
        //first thread lock on 1st obj
    //2nd thread lock on the second object
    /*
    THis is why it is extreamly convinient to create final objects for different locks
    becz this is how we can makesure that independent methods can be executed by
    independent threads at same time.
    //at the same time != parallel execution
     */
    public static  void increment1(){
        synchronized(lock1){
            counter1++;
        }
    }
    public static void increment2(){
        synchronized(lock2){
            counter2++;
        }
    }
    public static void process(){
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i <100;++i)
                    increment1();
            }
        }
        );
        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i <100;++i)
                    increment2();
            }
        }
        );
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("The counter1 is:"+ counter1);
        System.out.println("The counter2 is:"+ counter2);
    }

    public static void main(String[] args) {
        process();
    }



}

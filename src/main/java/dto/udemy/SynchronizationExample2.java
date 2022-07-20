package dto.udemy;

public class SynchronizationExample2 {
    public static int count = 0;

    public static void process(){

        Thread t1= new Thread(new Runnable() {

            @Override
            public void run() {
              for(int i=0; i<100;++i){
                  count++;
              }
            }
        });
        Thread t2= new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i=0; i<100;++i){
                   count++;
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
        System.out.println("The counter value is "+count);
    }
    public static void main(String[] args) {
        process();

    }
}

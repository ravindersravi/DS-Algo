package dto.udemy2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSynchronization {
    public static void main(String[] args) {
        /*
        Intrensic lock: note that efficicnet because threads have to wait for each other
        even when they want to execute independent methods
         */
        List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());;
        Thread t1 = new Thread(()->{
            for(int i=0;i<1000;i++){
                list.add(i);
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=0;i<1000;i++){
                list.add(i);
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("SIze of array:"+ list.size());
    }
}

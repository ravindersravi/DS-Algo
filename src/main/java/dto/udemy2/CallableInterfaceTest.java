package dto.udemy2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class ProcessorClass implements Callable<String> {
    private int id;
    public ProcessorClass(int id) {
        this.id = id;
    }
    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "ID "+id;
    }
}

public class CallableInterfaceTest {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        List<Future<String>> list = new ArrayList<>();
        for(int i=0;i<50;i++){
            Future<String> ls = service.submit(new ProcessorClass(i+1));
            list.add(ls);
        }
        for(Future<String> f: list){
            try {
                System.out.println(f.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}

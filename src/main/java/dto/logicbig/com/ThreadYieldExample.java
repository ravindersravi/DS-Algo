package dto.logicbig.com;

public class ThreadYieldExample {
    public static void main(String[] args) {
        Task task1 = new Task();
        new Thread(task1).start();

        Task task2 = new Task();
        new Thread(task2).start();
    }
    private static class Task implements Runnable{
        private int c;
        @Override
        public void run() {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Started..");
            for(int i=0;i<1000;i++){
                c++;
            }
            System.out.println(threadName + " ended");
        }
    }
}

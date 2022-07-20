package oracle;

public class SimpleThreads {
    static void threadMessage(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.format("%s : %s%n", threadName, message);
    }


    private static class MessageLoop implements Runnable {
        public void run() {
            String[] importantInfo = {"Mares eat oats", "Does eat oats", "Little labs eat", "a kid will eat"};
            try {
                for (int i = 0; i < importantInfo.length; i++) {
                    Thread.sleep(4000);
                    threadMessage(importantInfo[i]);
                }
            } catch (InterruptedException e) {
                threadMessage("I wan't done!");
            }

        }

        public static void main(String[] args) throws InterruptedException {
            long patience = 1000 * 60 * 60;
            if (args.length > 0) {
                try {
                    patience = Long.parseLong(args[0]) * 1000;
                } catch (NumberFormatException e) {
                    System.out.println("argument must be an integer.");
                    System.exit(1);
                }
            }
            threadMessage("Starting MessageLoop thread");


        }
    }
}


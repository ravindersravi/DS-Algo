package dto.udemy;

class Runner_A extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Runner_A-:" + i);
        }
    }
}
class Runner_B extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Runner_B-:" + i);
        }
    }
}


public class ThreadClass extends Thread {
    public static void main(String[] args) {
        Runner_A r1 = new Runner_A();
        Runner_B r2 = new Runner_B();
        r1.start();

        try {
            r1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        r2.start();
        System.out.println("main method");

    }
}

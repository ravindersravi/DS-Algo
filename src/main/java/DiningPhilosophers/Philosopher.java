package DiningPhilosophers;

import lombok.SneakyThrows;
import lombok.ToString;

import java.util.Random;

public class Philosopher implements Runnable {
    private int id;
    private volatile boolean full;
    private Chopsticks leftChopStick;
    private Chopsticks rightChopStick;
    private Random random;
    private int eatingCount;

    public Philosopher(int id, Chopsticks leftChopStick, Chopsticks rightChopStick) {
        this.id = id;
        this.leftChopStick = leftChopStick;
        this.rightChopStick = rightChopStick;
        this.random = new Random();
    }

    @Override
    public void run() {
        try{
            //after eating a lot(1000) then we will terminate the given thread.
            while(!full) {
                think();
                if(leftChopStick.pickUp(this,State.LEFT)){
                    // the philosopher is able to acquire the left chopstick
                    if(rightChopStick.pickUp(this,State.RIGHT)){
                        eat();
                        rightChopStick.putDown(this,State.RIGHT);
                    }
                    leftChopStick.putDown(this,State.LEFT);
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }

    }

    private void think()  {
        System.out.println(this + " is thinking...");
        //the philosopher thinks for a random time [0,1000]
        try {
            Thread.sleep(random.nextInt(1000));
        } catch(InterruptedException e){
            System.out.println("interrupted think thread in philosopher class");
        }
    }

    @Override
    public String toString() {
        return "philosopher "+id;
    }

    private void eat()  {
        System.out.println(this + "is eating...");
        eatingCount++;
        try{
            Thread.sleep(random.nextInt(1000));
        }
        catch (InterruptedException e){
            System.out.println("thread interrupted in eat method!!" );
        }

    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public boolean isFull() {
        return this.full;
    }

    public int getEatingCOunter() {
        return this.eatingCount;
    }
}

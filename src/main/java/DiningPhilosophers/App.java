package DiningPhilosophers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) throws InterruptedException{
        ExecutorService executorService = null;
        Philosopher[] philosophers = null;
        Chopsticks[] chopsticks = null;
        try{
            philosophers = new Philosopher[Constanst.NUMBER_OF_PHILOSOPHERS];
            chopsticks = new Chopsticks[Constanst.NUMBER_OF_CHOPSTICKS];
            for(int i=0;i<Constanst.NUMBER_OF_CHOPSTICKS;++i)
                chopsticks[i] = new Chopsticks(i);
                executorService = Executors.newFixedThreadPool(Constanst.NUMBER_OF_PHILOSOPHERS);
            for(int i=0;i<Constanst.NUMBER_OF_PHILOSOPHERS;++i){
                philosophers[i] = new Philosopher(i, chopsticks[i], chopsticks[(i+1)%Constanst.NUMBER_OF_PHILOSOPHERS]);
                    executorService.execute(philosophers[i]);
             }
            Thread.sleep(Constanst.SIMULATION_RUNNING_TIME_MILLI_SEC);

            for(Philosopher philosopher : philosophers)
                philosopher.setFull(true);

        }
        finally {
            executorService.shutdownNow();
            while(!executorService.isTerminated())
                Thread.sleep(1000);
            for(Philosopher philosopher : philosophers)
                System.out.println(philosopher+ " eat #"+philosopher.getEatingCOunter()+ " times! ");

        }

    }
}

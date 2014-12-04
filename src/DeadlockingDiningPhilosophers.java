import java.io.IOException;

/**
 * 11/23/14  9:07 PM
 * Created by JustinZhang.
 */
public class DeadlockingDiningPhilosophers {

    public static void main(String[] args) throws InterruptedException, IOException {

        /*
        int ponder = 5;
        if(args.length > 0){
            ponder = Integer.parseInt(args[0]);
        }

        int size = 5;
        if(args.length > 1){
            size = Integer.parseInt(args[1]);
        }

        ExecutorService exec = Executors.newCachedThreadPool();

        Chopstick[] sticks = new Chopstick[size];

        for (int i = 0; i < size; i++) {
            sticks[i] = new Chopstick();
        }

        for (int i = 0; i < size; i++) {
            exec.execute(new Philosopher(i,ponder,sticks[i],sticks[(i+1)%size]));
        }

        if(args.length == 3 && args[2].equals("timeout")){
            TimeUnit.SECONDS.sleep(5);
        }else{
            System.out.println("Press 'Enter' to quit");
            System.in.read();
        }
        exec.shutdownNow();

*/

    }
}

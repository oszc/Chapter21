import java.util.concurrent.BlockingQueue;

/**
 * 11/16/14  12:53 AM
 * Created by JustinZhang.
 */
public class LiftOffRunner implements Runnable {
    private BlockingQueue<LiftOff> rockets;


    public LiftOffRunner(BlockingQueue<LiftOff> rockets) {
        this.rockets = rockets;
    }


    public void add(LiftOff lo) {
        try {
            rockets.put(lo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                LiftOff rocket = rockets.take();
                rocket.run();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Walking from take()");
        }
        System.out.println("Exiting LiftOffRunner");
    }
}

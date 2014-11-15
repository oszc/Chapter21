import java.util.concurrent.TimeUnit;

/**
 * 11/5/14  12:01 AM
 * Created by JustinZhang.
 */
public class SleepBlocked implements Runnable{
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
        System.out.println("Exiting SleepBlocked.run()");
    }
}

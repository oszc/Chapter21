import java.util.concurrent.TimeUnit;

/**
 * 10/10/14  3:06 PM
 * Created by JustinZhang.
 */
public class SimpleDaemons implements Runnable {
    @Override
    public void run() {
        while (true){
            try {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() +" "+ this);
            } catch (InterruptedException e) {
                System.out.println("sleep() interrupted");
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true);
            daemon.start();
        }
        System.out.println("All daemons started");
        TimeUnit.MILLISECONDS.sleep(175);
    }
}

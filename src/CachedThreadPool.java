import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 10/10/14  11:19 AM
 * Created by JustinZhang.
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff());

        }
        exec.shutdown();
    }
}

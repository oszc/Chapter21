import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 10/10/14  1:20 PM
 * Created by JustinZhang.
 */
public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}

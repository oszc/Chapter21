import java.util.concurrent.ThreadFactory;

/**
 * 10/10/14  3:19 PM
 * Created by JustinZhang.
 */
public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        return t;
    }
}

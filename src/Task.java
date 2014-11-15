/**
 * 11/9/14  4:26 PM
 * Created by JustinZhang.
 */
public class Task implements Runnable{
    static Blocker blocker = new Blocker();
    @Override
    public void run() {
        blocker.waitingCall();
    }
}

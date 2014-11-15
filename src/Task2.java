/**
 * 11/9/14  4:27 PM
 * Created by JustinZhang.
 */
public class Task2 implements Runnable{
    static Blocker blocker = new Blocker();
    @Override
    public void run() {
        blocker.waitingCall();
    }
}

/**
 * 11/5/14  1:55 PM
 * Created by JustinZhang.
 */
public class Blocked2 implements Runnable {
    BlockedMutex blocked = new BlockedMutex();
    @Override
    public void run() {

        System.out.println("Waiting for f() in BlockedMutex");
        blocked.f();
        System.out.println("Broken out of blocked call");
    }
}

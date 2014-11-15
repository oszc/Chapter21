/**
 * 11/5/14  12:12 AM
 * Created by JustinZhang.
 */
public class SynchronizedBlocked implements Runnable {

    public SynchronizedBlocked() {
        new Thread(){
            @Override
            public void run() {
                f();
            }
        }.start();
    }

    public synchronized void f(){
        while (true){
            Thread.yield();
        }
    }

    @Override
    public void run() {
        System.out.println("Trying to call f()");
        f();
        System.out.println("Exiting synchronizedBlocked.run()");
    }
}

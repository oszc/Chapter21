/**
 * 11/23/14  8:05 PM
 * Created by JustinZhang.
 */
public class Chopstick {
    private boolean taken = false;

    public synchronized void take() throws InterruptedException {
        while (taken){
            wait();
        }
        taken = true;
    }

    public synchronized void drop(){
        taken =false;
        notifyAll();
    }
}

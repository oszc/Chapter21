/**
 * 10/10/14  10:56 AM
 * Created by JustinZhang.
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for liftOff");
    }
}

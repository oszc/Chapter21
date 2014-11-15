package exercise;

/**
 * 11/10/14  11:25 PM
 * Created by JustinZhang.
 */
public class WaxOn implements Runnable {
    private Car car;

    public WaxOn(Car car) {
        this.car = car;
    }

    @Override
    public void run() {


        while (!Thread.interrupted()) {
            System.out.println("Wax on");
            car.waxed();
            car.waitingForBuffing();
        }
        System.out.println("Exiting via interrupted");
    }

}

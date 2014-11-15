package exercise;

import java.util.concurrent.TimeUnit;

/**
 * 11/10/14  11:31 PM
 * Created by JustinZhang.
 */
public class WaxOff implements Runnable{

    private Car car;

    public WaxOff(Car car) {
        this.car = car;
    }

    @Override
    public void run() {

        while (!Thread.interrupted()){
            car.waitingForWaxed();
            System.out.println("Wax Off");
            try {
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            car.buffed();

        }
    }
}

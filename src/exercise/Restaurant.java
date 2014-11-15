package exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 11/11/14  12:22 AM
 * Created by JustinZhang.
 */
public class Restaurant {
    ExecutorService exec = Executors.newCachedThreadPool();

    Chef chef = new Chef(this);
    WaitPerson waitPerson = new WaitPerson(this);

    Meal meal;

    public Restaurant() {
        exec.execute(chef);
        exec.execute(waitPerson);
    }

    public static void main(String[] args) {
        new Restaurant();
    }

}

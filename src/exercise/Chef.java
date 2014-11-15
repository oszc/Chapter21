package exercise;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 11/11/14  12:21 AM
 * Created by JustinZhang.
 */
public class Chef implements Runnable{
    Restaurant restaurant;
    int count = 0;

    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();


    public Chef(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {

        while (!Thread.interrupted()) {
            lock.lock();
            try {
                while (restaurant.meal != null) {
                    try {
                        condition.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } finally {
                lock.unlock();
            }

            if (++count == 10) {
                restaurant.exec.shutdownNow();
            }


            restaurant.waitPerson.lock.lock();
            try {
                if (restaurant.meal == null) {
                    restaurant.meal = new Meal(count);
                    restaurant.waitPerson.condition.signalAll();
                }
            } finally {
                restaurant.waitPerson.lock.unlock();
            }
        }
    }
}

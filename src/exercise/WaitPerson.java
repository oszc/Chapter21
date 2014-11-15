package exercise;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 11/11/14  12:21 AM
 * Created by JustinZhang.
 */
public class WaitPerson implements Runnable{

    Restaurant restaurant;

    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public WaitPerson(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {

        while (!Thread.interrupted()) {
            lock.lock();
            try {
                while (restaurant.meal == null) {
                    try {
                        condition.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } finally {
                lock.unlock();
            }

            System.out.println("order up:" + restaurant.meal);
            restaurant.chef.lock.lock();
            try {

                restaurant.meal = null;
                restaurant.chef.condition.signalAll();
            } finally {
                restaurant.chef.lock.unlock();
            }
        }
    }
}

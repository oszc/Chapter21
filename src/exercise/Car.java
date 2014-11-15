package exercise;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 11/10/14  10:50 PM
 * Created by JustinZhang.
 */
public class Car {

    private boolean waxOn = false;

    private Lock lock  = new ReentrantLock();

    private Condition condition = lock.newCondition();


    public void waxed(){

        lock.lock();
        try {
            waxOn = true;
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }

    public void buffed(){
        lock.lock();

        try{

            waxOn = false;
            condition.signalAll();

        }finally {

            lock.unlock();
        }
    }

    public void waitingForWaxed(){
        lock.lock();

        try {
            while (waxOn == false)
                condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void waitingForBuffing(){

        lock.lock();
        try{
            while (waxOn == true){
                condition.await();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}

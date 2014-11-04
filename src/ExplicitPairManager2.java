import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 11/3/14  11:11 AM
 * Created by JustinZhang.
 */
public class ExplicitPairManager2 extends PairManager{

    private Lock lock = new ReentrantLock();
    @Override
    public  void increment() {
        lock.lock();
        Pair temp = null;
        try {
            p.incrementX();
            p.incrementY();
            temp = getPair();
        }finally {
            lock.unlock();
        }
        store(temp);
    }
}

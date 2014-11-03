/**
 * 11/2/14  8:14 PM
 * Created by JustinZhang.
 */
public class PairManager1 extends PairManager{
    @Override
    public synchronized void increment() {

        p.incrementX();
        p.incrementY();
        store(getPair());
    }
}

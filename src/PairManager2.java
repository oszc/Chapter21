/**
 * 11/2/14  8:18 PM
 * Created by JustinZhang.
 */
public class PairManager2 extends PairManager{
    @Override
    public void increment() {
        Pair temp;

        synchronized (this){
            p.incrementY();
            p.incrementX();
            temp = getPair();
        }

        store(temp);

    }
}

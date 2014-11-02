/**
 * 10/30/14  9:19 PM
 * Created by JustinZhang.
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;

    public abstract int next();

    public void cancel(){canceled =  true;}

    public boolean isCanceled(){
        return canceled;
    }

}

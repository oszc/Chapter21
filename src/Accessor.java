/**
 * 11/4/14  2:20 PM
 * Created by JustinZhang.
 */
public class Accessor implements Runnable{


    private final int id;

    public Accessor(int id) {
        this.id = id;
    }

    @Override
    public void run() {

        while (!Thread.currentThread().isInterrupted()){
            ThreadLocalVariableHolder.increment();
            System.out.println(this);
            Thread.yield();
        }
    }

    @Override
    public String toString() {
        return "#"+id+": "+ThreadLocalVariableHolder.get();
    }
}

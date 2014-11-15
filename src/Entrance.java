import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * 11/4/14  3:04 PM
 * Created by JustinZhang.
 */
public class Entrance implements Runnable{

    private static Count count = new Count();

    private static List<Entrance> entrances = new ArrayList<Entrance>();

    private int number;

    private final int id;

    private static volatile boolean canceled =false;

    public static void cancel(){canceled = true;}

    public Entrance(int id) {
        this.id = id;
        entrances.add(this);
    }

    @Override
    public void run() {
        while (!canceled){
            /*
            synchronized (this){
                ++number;
            }
            */
            ++number;

            System.out.println(this+" Total: "+ count.increment());

            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Sleep interrupted");
            }
        }

        System.out.println("Stopping "+this);
    }

    public synchronized int getValue(){
        return number;
    }

    @Override
    public String toString() {
        return "Entrance "+ id +": "+getValue();
    }

    public static int getTotalCount(){
        return count.value();
    }

    public static int sumEntrances(){
        int sum = 0;
        for(Entrance entrance:entrances){
            sum+=entrance.getValue();
        }
        return sum;
    }
}

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 11/4/14  3:14 PM
 * Created by JustinZhang.
 */
public class OrnamentalGarden {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService exec = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++) {

            exec.execute(new Entrance(i));
        }

        TimeUnit.MILLISECONDS.sleep(70000);

        Entrance.cancel();

        exec.shutdown();

        if(!exec.awaitTermination(250,TimeUnit.MILLISECONDS))
            System.out.println("Some task were not terminated!");

        System.out.println("Total: "+ Entrance.getTotalCount());

        System.out.println("Sum of Entrance:"+Entrance.sumEntrances());


    }
}

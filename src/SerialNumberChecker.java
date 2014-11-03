import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 11/2/14  11:05 AM
 * Created by JustinZhang.
 */
public class SerialNumberChecker {
    public static final int SIZE = 10;
    private static CircularSet serials = new CircularSet(1000);
    private static ExecutorService exec = Executors.newCachedThreadPool();

    static class SerialChecker implements Runnable{
        @Override
        public void run() {
            while (true){
                int serial = SerialNumberGenerator.nextSerialNumber();
                if(serials.contains(serial)){
                    System.out.println("Duplicate: "+serial);
                    System.exit(0);
                }
                serials.add(serial);
            }
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < SIZE; i++) {

            exec.execute(new SerialChecker());
        }



    }
}

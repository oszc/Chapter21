/**
 * 11/3/14  2:08 PM
 * Created by JustinZhang.
 */
public class DualSynch {

    private Object syncObject = new Object();

    public synchronized void f(){
        for (int i = 0; i < 5; i++) {
            System.out.println("f()");
            Thread.yield();

        }
    }

    public void g(){
        synchronized (syncObject){
            for (int i = 0; i < 5; i++) {
                System.out.println("g()");
                Thread.yield();
            }
        }
    }

    public static class SyncObject{
        public static void main(String[] args) {
            final DualSynch ds =new DualSynch();
            new Thread(){
                @Override
                public void run() {
                    super.run();
                    ds.f();
                }
            }.start();
            ds.g();
        }

    }
}

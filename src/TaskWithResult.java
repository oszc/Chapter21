import java.util.concurrent.Callable;

/**
 * 10/10/14  1:33 PM
 * Created by JustinZhang.
 */
public class TaskWithResult implements Callable<String> {
    private int id;
    public TaskWithResult(int id){
        this.id = id;
    }


    @Override
    public String call() throws Exception {
        return "result of TaskWithResult "+id;
    }
}

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;

public class CustomExecutor {

   private PriorityBlockingQueue<Task> tasks;

    final int halfProcessors = Runtime.getRuntime().availableProcessors()/2;
    final int maxProcessors = Runtime.getRuntime().availableProcessors() -1;

    public CustomExecutor(){
        PriorityBlockingQueue<Task> tasks = new PriorityBlockingQueue<Task>();
    }

    public <T>Future<T> submit (Task<T> task){
        return
    }

    public <T>Future<T> submit (Callable<T> task, TaskType type){
        return
    }

    public <T>Future<T> submit (Callable<T> task){

    }




//    }
//    public void submit ()

    public void gracefullyTerminate() {
    }

    public String getCurrentMax() {
        return null;
    }


}

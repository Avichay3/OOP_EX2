import java.util.concurrent.Callable;
import java.util.concurrent.PriorityBlockingQueue;
public class CustomExecutor {

    private PriorityBlockingQueue<Callable<Void>> queue = new PriorityBlockingQueue<>();
    public void submit(Object o, TaskType computational) {
    }

    public void gracefullyTerminate() {
    }

    public String getCurrentMax() {
    }

}

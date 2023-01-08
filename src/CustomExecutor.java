import java.util.concurrent.*;

public class CustomExecutor {

   private final PriorityBlockingQueue<Runnable> tasks;
   private int max_prior;

   private final ThreadPoolExecutor executor;

    public CustomExecutor(){
        this.tasks = new PriorityBlockingQueue<>();
        final int halfProcessors = Runtime.getRuntime().availableProcessors()/2;
        final int maxProcessors = Runtime.getRuntime().availableProcessors() -1;
        this.executor = new ThreadPoolExecutor(halfProcessors, maxProcessors, 300, TimeUnit.MILLISECONDS, tasks);
    }

    public <T>Future<T> submit (Task<T> task){
        this.max_prior = task.getPriority_of_task();
        return executor.submit(task);
    }

    public <T>Future<T> submit (Callable<T> task,  TaskType type){ //section
        return submit(new Task<>( task, type));
    }

    public <T>Future<T> submit (Callable<T> callable){
        return submit(new Task<T> (callable));
    }

    public void gracefullyTerminate() {
        executor.shutdown();
    }

    public int getCurrentMax() {
        return this.max_prior;
}
}

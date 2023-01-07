import java.util.concurrent.Callable;

public class Task<T> implements Callable<T>, Comparable<Task<T>> {
    private Callable<T> task;
    private int priority_of_task;



    public Task (Callable<T> task, TaskType type){
        this.task = task;
        this.priority_of_task = type.getPriorityValue();
    }
    public Task (Callable<T> task){
        this.task = task;
        this.priority_of_task = 0;
    }

    public static Task createTask(Callable task){ //section 3 in the assignment
        return new Task(task);
    }

    public static Task createTask(Callable task, TaskType taskType) { //section 4 int the assignment
        return new Task(task, taskType);
    }

    @Override
    public int compareTo(Task<T> task2) { //section 5 in the assignment
        int res = this.priority_of_task - task2.priority_of_task;
        if(res == 0){
            return 1;
        } else if (res < 0) {
            return -1;
        }
        else return 1;

    }

    @Override
    public  T call() throws Exception { //section 2 in the assignment
        return this.task.call();
    }
}

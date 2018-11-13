package AlgorytmyCwiczenia.DesignPatterns;

import java.util.ArrayList;
import java.util.List;

public class Executor {

    private List<Runnable> tasks;

    public Executor() {
        tasks = new ArrayList<>();
    }

    public void addTask(Runnable task){
        tasks.add(task);
    }

    public void runTasks(){
        tasks.forEach(Runnable::run);
    }
}

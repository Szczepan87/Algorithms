package AlgorytmyCwiczenia;

import AlgorytmyCwiczenia.DesignPatterns.Executor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Executor executor = new Executor();
        executor.addTask(() -> System.out.println("Task 1"));
        executor.addTask(() -> System.out.println("Task 2"));
        executor.addTask(() -> System.out.println("Task 3"));
        executor.runTasks();
    }
}

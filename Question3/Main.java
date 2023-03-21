package Question3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args)
    {
        List<Callable<String>> tasks = new ArrayList<>();
        tasks.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(1000);
                return "Task 1";
            }
        });
        tasks.add(() -> {
            Thread.sleep(1000);
            return "Task 2";
        });
        tasks.add(() -> {
            Thread.sleep(1000);
            return "Task 3";
        });
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try
        {
            List<Future<String>> futures = executorService.invokeAll(tasks);
            for(Future<String> future : futures)
            {
                System.out.println(future.get());
            }
        }
        catch(InterruptedException | ExecutionException e)
        {
            e.printStackTrace();
        }
        finally {
            executorService.shutdown();
        }
    }
}
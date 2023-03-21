package Question5;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task implements Runnable
{
    private int id;

    public Task(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread starts executing");
            Thread.sleep(1000);
            System.out.println("Thread stop executing");
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i = 0; i < 5; i++) {
            executorService.submit(new Task(i));
        }

        executorService.shutdown();
        if(!executorService.awaitTermination(1, TimeUnit.SECONDS)) {
            System.out.println("Executor still running...");
            List<Runnable> runningTasks = executorService.shutdownNow();
            System.out.println("Total Running Tasks : " + runningTasks.size());
        }
    }
}
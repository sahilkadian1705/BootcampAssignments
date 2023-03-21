package Question1;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class CallableExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> callable = new Callable() {
            @Override
            public Integer call() throws Exception {
                System.out.println(Thread.currentThread().getName() + " execution started...");
                try
                {
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " execution completed !");
                return 12;
            }
        };
        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        Thread t = new Thread(futureTask);
        t.start();
        System.out.println("Waiting for tasks to get completed...");
        Integer value = futureTask.get();
        System.out.println("Value returned : " + value);
    }
}
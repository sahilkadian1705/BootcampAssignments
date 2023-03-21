package Question4;

import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            Callable<Integer> callable = new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    Random random = new Random();
                    Integer result = random.nextInt(100);
                    Thread.sleep(1000);
                    return result;
                }
            };

            Future<Integer> future = executorService.submit(callable);
            System.out.println("Random Number : " + future.get());
        }
        catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        finally {
            executorService.shutdown();
        }
    }
}
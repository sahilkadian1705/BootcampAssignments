package Question1;

public class RunnableExample {

    public static void main(String[] args)
    {
        Runnable run = new Runnable() {
            @Override
            public void run()
            {
                System.out.println(Thread.currentThread().getName() + " execution started...");
                try
                {
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " execution completed...");
            }
        };

        Thread t = new Thread(run, "Thread ABC");
        t.start();

    }
}
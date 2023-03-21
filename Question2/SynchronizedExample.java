package Question2;

public class SynchronizedExample {
    private int count = 0;

    public synchronized void increment()
    {
        count++;
    }

    public void perform()
    {
        synchronized (this)
        {
            count--;
        }
    }

    public int getCount()
    {
        return this.count;
    }

    public static void main(String[] args)
    {
        SynchronizedExample s = new SynchronizedExample();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++)
                {
                    s.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 50; i++)
                {
                    s.perform();
                }
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Total count : " + s.getCount());
    }
}
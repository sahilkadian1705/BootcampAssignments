package Question1;

public class UsingRunnable implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 2; i++) {
            System.out.println("Thread executing : " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Thread execution finished : " + Thread.currentThread().getName());
        }
    }
}
class myClass
{
    public static void main(String[] args)
    {
        UsingRunnable myThreadObj = new UsingRunnable();
        Thread t1 = new Thread(myThreadObj, "Thread 1");
        Thread t2 = new Thread(myThreadObj, "Thread 2");
        t1.start();
        try {
            System.out.println("Current thread name : " + Thread.currentThread().getName());
            t1.join();
        }
        catch(Exception e) {
            System.out.println("Exception caught : " + e);
        }
        t2.start();
        try {
            System.out.println("Current thread name : " + Thread.currentThread().getName());
            t2.join();
        }
        catch(Exception e) {
            System.out.println("Exception caught : " + e);
        }
    }
}
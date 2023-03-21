package Question1;
public class UsingThread extends Thread{

    @Override
    public void run() {
        for(int i = 0; i < 2; i++) {
            System.out.println("Thread executing : " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Thread executing finished : " + Thread.currentThread().getName());
        }
    }
}
class Class
{
    public static void main(String[] args)
    {
        UsingThread t1 = new UsingThread();
        UsingThread t2 = new UsingThread();
        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        try {
            t1.join();
        }
        catch(Exception e){
            System.out.println("Exception caught : " + e);
        }

        t2.start();
        try {
            t2.join();
        }
        catch(Exception e) {
            System.out.println("Exception caught : " + e);
        }
    }
}
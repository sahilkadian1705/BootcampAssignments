package Question3;
class VolatileExample{
    volatile int val=0;
    public synchronized void add(){
        val++;
        System.out.println(Thread.currentThread().getName()+" "+ val);
    }
}
public class Main {
    public static void main(String[] args) {
        VolatileExample v= new VolatileExample();
        Thread t1 = new Thread(()->{
            for(int i=0;i<5;i++)
                v.add();


        });
        Thread t2 = new Thread(()->{
            for(int i=0;i<5;i++)
                v.add();
        });
        t1.start();
        t2.start();
    }
}
package Question4;

public class Main {
    public static void main(String[] args) {
        Object lock1=new Object();
        Object lock2=new Object();
        Thread t1=new Thread(){
            @Override
            public void run() {
                synchronized (lock1){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Thread T1 Acquired Lock1");
                    synchronized (lock2){
                        System.out.println("Thread T1 Acquired Lock2");
                    }
                }
            }
        };
        Thread t2=new Thread() {
            @Override
            public void run() {
                synchronized (lock2){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Thread T2 Acquired Lock2");
                    synchronized (lock1){
                        System.out.println("Thread T2 Acquired Lock1");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
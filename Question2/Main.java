package Question2;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        ReentrantLock lock1=new ReentrantLock();
        ReentrantLock lock2=new ReentrantLock();
        Thread t1=new Thread() {
            @Override
            public void run() {
                lock1.lock();
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread 1 Acquired Lock1");
                lock2.lock();
                System.out.println("Thread 1 Acquired Lock2");
            }
        };
        Thread t2=new Thread() {
            @Override
            public void run() {
                lock2.lock();
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread 2 Acquired Lock2");
                lock1.lock();
                System.out.println("Thread 2 Acquired Lock1");
            }
        };
        t1.start();
        t2.start();
    }
}
package threaddemo;
public class ThreadLifeCycleDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread1()); // NEW state
        Thread t2 = new Thread(new Thread2()); // NEW state
        System.out.println("t1 intial state : " + t1.getState());
        t1.start();
        System.out.println("t2 intial state : " + t2.getState());
        t2.start();
        try { 
        	t1.join();
        	t2.join();
        } catch (InterruptedException e) {
        	System.out.println("main thread interrupted");        	
        }
        System.out.println("Thread 1 state after execution : " + t1.getState());
        System.out.println("Thread 2 state after execution : " + t2.getState());
        
    }
}
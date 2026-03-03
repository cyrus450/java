package threaddemo;

class Thread1 implements Runnable{

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
            	System.out.println("Thread 1 : " + i);
                Thread.sleep(200);
                Thread.yield();// Hint to scheduler to let other threads run               
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
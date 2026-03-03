package producerConsumer;
class SharedBuffer {
    private int number;
    private boolean available = false;
    synchronized void produce(int value, int pid) throws InterruptedException {
        while (available) {
            wait();
        }
        number = value;
        available = true;
        System.out.println("Producer " + pid + " put : " + value);
        notify();
    }
    synchronized void consume(int cid) throws InterruptedException {
        while (!available) {
            wait();
        }
        available = false;
        System.out.println("Consumer " + cid + " got : " + number);
        notify();
    }
}
// Producer Thread
class Producer extends Thread {
    SharedBuffer buffer;
    int pid;
    Producer(SharedBuffer buffer, int pid) {
        this.buffer = buffer;
        this.pid = pid;
    }
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {   // runs till 10
                buffer.produce(i, pid);
            }
        } catch (InterruptedException e) {
            System.out.println("Producer interrupted");
        }
    }
}
// Consumer Thread
class Consumer extends Thread {
    SharedBuffer buffer;
    int cid;
    Consumer(SharedBuffer buffer, int cid) {
        this.buffer = buffer;
        this.cid = cid;
        }
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {   // runs till 10
                buffer.consume(cid);
                }
        } catch (InterruptedException e) {
            System.out.println("Consumer interrupted");
        }
    }
}


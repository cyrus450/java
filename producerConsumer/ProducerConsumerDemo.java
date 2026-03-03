package producerConsumer;
import java.util.Scanner;

public class ProducerConsumerDemo {
public static void main(String[] args) {

       try( Scanner sc = new Scanner(System.in)){

        System.out.print("Enter the number : ");
        sc.nextInt();   // input taken (as per requirement, not used further)

        SharedBuffer buffer = new SharedBuffer();

        Producer p = new Producer(buffer, 1);
        Consumer c = new Consumer(buffer, 1);
        p.start();
        c.start();

    }
} }
package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<String> names = new LinkedList<>();

        names.offer("Arun");
        names.offer("Uday");
        names.offer("Somanath");

        System.out.println("Queue : " + names);

        System.out.println("First : " + names.peek());

        System.out.println("Removed : " + names.poll());

        System.out.println("Queue : " + names);

        names.offer("Rahul");

        System.out.println("Queue : " + names);

        System.out.println("First : " + names.element());

        System.out.println("Size : " + names.size());
    }
}
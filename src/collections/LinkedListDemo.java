package collections;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Arun");
        names.add("Uday");
        names.add("Somanath");

        System.out.println(names);
        names.add("Rahul");
        System.out.println(names);
        names.addFirst("Aman");
        System.out.println(names);
        names.addLast("Ravi");
        System.out.println(names);
        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        names.removeFirst();
        System.out.println(names);
        names.removeLast();
        System.out.println(names);
        System.out.println(names.size());
    }
}
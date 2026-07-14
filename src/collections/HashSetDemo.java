package collections;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        names.add("Arun");
        names.add("Uday");
        names.add("Somanath");
        names.add("Arun");

        System.out.println("HashSet : " + names);

        System.out.println("Contains Arun : " + names.contains("Arun"));

        names.remove("Uday");

        System.out.println("After Remove : " + names);

        System.out.println("Size : " + names.size());

        System.out.println("Is Empty : " + names.isEmpty());

        names.clear();

        System.out.println("After Clear : " + names);
    }
}
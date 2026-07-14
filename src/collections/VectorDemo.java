package collections;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<String> names = new Vector<>();

        names.add("Arun");
        names.add("Uday");
        names.add("Somanath");

        System.out.println(names);

        names.set(1, "Rahul");
        System.out.println(names);

        System.out.println("First Name : " + names.get(0));

        names.remove(2);
        System.out.println(names);

        System.out.println("Contains Arun : " + names.contains("Arun"));

        System.out.println("Size : " + names.size());

        names.clear();

        System.out.println(names);
    }
}
package collections;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Arun");
        names.add("Uday");
        names.add("Somanath");

        System.out.println(names);
        names.add(1,"Ravi");
        System.out.println(names);
        System.out.println(names.get(1));
        names.remove(1);
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("Arun"));
        names.set(1, "Rahul");
        System.out.println(names);
        names.clear();
        System.out.println(names);

    }
}
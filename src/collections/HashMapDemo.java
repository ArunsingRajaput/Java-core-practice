package collections;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Arun");
        students.put(102, "Uday");
        students.put(103, "Somanath");

        System.out.println("Students : " + students);

        System.out.println("Student 102 : " + students.get(102));

        System.out.println("Contains Key 101 : " + students.containsKey(101));

        System.out.println("Contains Value Arun : " + students.containsValue("Arun"));

        students.remove(103);

        System.out.println("After Remove : " + students);

        System.out.println("Keys : " + students.keySet());

        System.out.println("Values : " + students.values());

        System.out.println("Size : " + students.size());

        for (var entry : students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
package collections;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();

        students.put(101, "Arun");
        students.put(102, "Uday");
        students.put(103, "Somanath");

        System.out.println("Students : " + students);

        System.out.println("Student 101 : " + students.get(101));

        students.remove(102);

        System.out.println("After Remove : " + students);

        System.out.println("Keys : " + students.keySet());

        System.out.println("Values : " + students.values());

        System.out.println("Contains Arun : " + students.containsValue("Arun"));

        for (var entry : students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
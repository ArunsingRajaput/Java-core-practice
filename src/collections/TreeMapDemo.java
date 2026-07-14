package collections;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(103, "Somanath");
        students.put(101, "Arun");
        students.put(102, "Uday");

        System.out.println("Students : " + students);

        System.out.println("Student 101 : " + students.get(101));

        System.out.println("First Key : " + students.firstKey());

        System.out.println("Last Key : " + students.lastKey());

        System.out.println("Higher Key of 101 : " + students.higherKey(101));

        System.out.println("Lower Key of 103 : " + students.lowerKey(103));

        System.out.println("Contains Key 102 : " + students.containsKey(102));

        students.remove(102);

        System.out.println("After Remove : " + students);

        for (var entry : students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
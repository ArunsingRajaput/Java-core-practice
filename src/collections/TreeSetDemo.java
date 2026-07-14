package collections;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);

        System.out.println("Numbers : " + numbers);

        System.out.println("Ascending Order : "+numbers);

        System.out.println("Descending Order : "+numbers.descendingSet());

        System.out.println("First : " + numbers.first());

        System.out.println("Last : " + numbers.last());

        System.out.println("Higher than 30 : " + numbers.higher(30));

        System.out.println("Lower than 30 : " + numbers.lower(30));

        System.out.println("Contains 40 : " + numbers.contains(40));

        numbers.remove(20);

        System.out.println("After Remove : " + numbers);

        System.out.println("Size : " + numbers.size());
    }
}
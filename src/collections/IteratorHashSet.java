package collections;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorHashSet {

    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        Iterator<Integer> it = numbers.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
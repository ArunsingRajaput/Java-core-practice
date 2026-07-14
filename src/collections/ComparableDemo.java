package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(103, "Somanath"));
        list.add(new Student(101, "Arun"));
        list.add(new Student(102, "Uday"));

        Collections.sort(list);

        System.out.println(list);
    }
}
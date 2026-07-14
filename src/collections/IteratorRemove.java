package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemove {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Arun");
        names.add("Uday");
        names.add("Somanath");

        Iterator<String> it = names.iterator();

        while(it.hasNext()) {

            String name = it.next();

            if(name.equals("Uday")) {
                it.remove();
            }
        }

        System.out.println(names);
    }
}
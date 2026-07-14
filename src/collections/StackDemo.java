package collections;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<String> books = new Stack<>();

        books.push("Java");
        books.push("Python");
        books.push("C++");

        System.out.println("Stack : " + books);

        System.out.println("Top : " + books.peek());

        System.out.println("Removed : " + books.pop());

        System.out.println("After Pop : " + books);

        System.out.println("Is Empty : " + books.empty());

        System.out.println("Search Java : " + books.search("Java"));
    }
}
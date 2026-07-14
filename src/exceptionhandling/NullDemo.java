package exceptionhandling;

public class NullDemo {

    public static void main(String[] args) {

        String name = null;

        try {
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("String is Null");
        } finally {
            System.out.println("Finally Block Executed");
        }
    }
}
package exceptionhandling;

public class FinallyDemo {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 2;

            System.out.println(a / b);

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero.");

        } finally {

            System.out.println("Finally block executed.");
        }
    }
}
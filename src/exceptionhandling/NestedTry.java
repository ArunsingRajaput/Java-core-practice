package exceptionhandling;

public class NestedTry {

    public static void main(String[] args) {

        try {
            System.out.println("Outer Try");

            try {
                int a = 10;
                int b = 0;
                System.out.println(a / b);
            } catch (ArithmeticException e) {
                System.out.println("Inner Catch: Cannot divide by zero");
            }

            System.out.println("Outer Try Continues");

        } catch (Exception e) {
            System.out.println("Outer Catch");
        }

        System.out.println("Program Ends");
    }
}
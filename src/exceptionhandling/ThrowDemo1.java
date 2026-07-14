package exceptionhandling;

public class ThrowDemo1 {

    public static void main(String[] args) {

        try {

            int age = 16;

            if (age < 18) {
                throw new ArithmeticException("Not Eligible");
            }

            System.out.println("Eligible");

        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());
        }

        System.out.println("Program Ends");
    }
}
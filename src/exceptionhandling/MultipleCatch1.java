package exceptionhandling;

public class MultipleCatch1 {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            System.out.println(a / b);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");

        } catch (Exception e) {
            System.out.println("Some other exception occurred.");
        }

        System.out.println("Program Ends");
    }
}
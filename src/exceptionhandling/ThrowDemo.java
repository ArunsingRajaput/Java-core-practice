package exceptionhandling;

public class ThrowDemo {

    public static void main(String[] args) {

        try {
            int age = 16;

            if (age < 18) {
                throw new ArithmeticException("not eligible");
            }
            System.out.println("Eligible");
        } catch (ArithmeticException e){
            System.out.println("first\n"+e.getMessage());
        }

        System.out.println("Program Ends");
    }
}
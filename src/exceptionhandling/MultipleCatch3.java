package exceptionhandling;

public class MultipleCatch3 {

    public static void main(String[] args) {

        try {

            String name = null;

            System.out.println(name.length());

        } catch (ArithmeticException e) {

            System.out.println("Arithmetic Exception");

        } catch (NullPointerException e) {

            System.out.println("String is Null");

        } catch (Exception e) {

            System.out.println("Other Exception");
        }
    }
}
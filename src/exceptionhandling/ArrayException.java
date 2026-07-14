package exceptionhandling;

public class ArrayException {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30};

        try {
            System.out.println(numbers[5]);   //invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Array Index");
        } finally {
            System.out.println("Finally Block Executed");
        }
    }
}
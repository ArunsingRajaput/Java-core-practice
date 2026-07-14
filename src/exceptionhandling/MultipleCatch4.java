package exceptionhandling;

public class MultipleCatch4 {

    public static void main(String[] args) {

        try {
            int a = 10;
            int  b = 0;
            System.out.println(a/b);

            int[] arr = {10, 20, 30};
            System.out.println(arr[5]);

            String name = null;
            System.out.println(name.length());

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Array Index");
        } catch (NullPointerException e){
            System.out.println("String is Null");
        }   catch (Exception e) {
            System.out.println("Other Exception");
        } finally {
            System.out.println("Program Ends.");
        }
    }
}
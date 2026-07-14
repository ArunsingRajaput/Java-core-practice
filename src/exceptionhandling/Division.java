package exceptionhandling;
import java.util.Scanner;

public class Division {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter First Number: ");
            int a = sc.nextInt();
            System.out.print("Enter Second Number: ");
            int b = sc.nextInt();
            System.out.println("Result = " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide by Zero");
        } finally {
            System.out.println("Thank You");
            sc.close();
        }
    }
}
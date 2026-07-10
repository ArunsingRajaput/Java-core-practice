package basics;

import java.util.Scanner;
public class ScannerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String Input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Integer Input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Double Input
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        // Character Input
        System.out.print("Enter your grade: ");
        char grade = sc.next().charAt(0);

        System.out.println("\nUser Details:");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Salary : " + salary);
        System.out.println("Grade  : " + grade);

        sc.close();
    }
}
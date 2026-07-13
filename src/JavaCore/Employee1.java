package JavaCore;

public class Employee1 {

    String name;
    static String company = "Google";

    Employee1(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " works at " + company);
    }

    public static void main(String[] args) {

        Employee1 e1 = new Employee1("Arun");
        Employee1 e2 = new Employee1("Uday");

        e1.display();
        e2.display();
    }
}
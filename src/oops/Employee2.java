package oops;

public class Employee2 {

    String name;
    int id;
    double salary;

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("Salary : " + salary);
    }

    void yearlySalary() {
        System.out.println("Yearly Salary : " + (salary * 12));
        System.out.println();
    }

    public static void main(String[] args) {

        Employee2 e1 = new Employee2();
        Employee2 e2 = new Employee2();
        Employee2 e3 = new Employee2();

        e1.name = "Arun";
        e1.id = 101;
        e1.salary = 20000;

        e2.name = "Somanath";
        e2.id = 102;
        e2.salary = 30000;

        e3.name = "Uday";
        e3.id = 103;
        e3.salary = 40000;

        e1.display();
        e1.yearlySalary();

        e2.display();
        e2.yearlySalary();

        e3.display();
        e3.yearlySalary();
    }
}
package oops;

public class ThisConst {

    String name;
    int id;
    double salary;

    ThisConst(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {

        ThisConst e1 = new ThisConst("Arun", 101, 20000);
        ThisConst e2 = new ThisConst("Uday", 102, 35000);

        e1.display();
        System.out.println();

        e2.display();
    }
}
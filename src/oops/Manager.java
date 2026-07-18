package oops;

public class Manager extends Employee {

    @Override
    void work() {
        System.out.println("Manager is Managing");
    }

    public static void main(String[] args) {
        Employee e = new Manager();
        e.work();
    }
}
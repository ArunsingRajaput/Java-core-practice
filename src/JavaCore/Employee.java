package JavaCore;

public class Employee {

    private String name;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void display() {
        System.out.println(name);
        System.out.println(salary);
    }

    public static void main(String[] args){
        Employee e = new Employee();

        e.setName("Arun");
        e.setSalary(30000);

        e.display();
    }
}
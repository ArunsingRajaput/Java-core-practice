package oops;

public class ConstOverloading {

    String name;
    int id;
    double salary;

    ConstOverloading(){
        System.out.println("Default Constructor\n");
    }

    ConstOverloading(String name){
        this.name = name;
    }

    ConstOverloading(String name, int id){
        this.name = name;
        this.id = id;
    }

    ConstOverloading(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("Salary : "+salary);
        System.out.println();
    }

    public static void main(String[] args){
        ConstOverloading e1 = new ConstOverloading();
        e1.display();

        ConstOverloading e2 = new ConstOverloading("Arun");
        e2.display();

        ConstOverloading e3 = new ConstOverloading("Uday",102);
        e3.display();

        ConstOverloading e4 = new ConstOverloading("Somanath",103,20000);
        e4.display();
    }

}

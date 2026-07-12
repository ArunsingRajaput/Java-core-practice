package oops;

public class Constructors {

    String name;
    int id;

    Constructors() {
        name = "Arun";
        id = 101;
    }

    void display() {
        System.out.println(name);
        System.out.println(id);
    }

    public static void main(String[] args) {

        Constructors c = new Constructors();
        c.display();
    }
}
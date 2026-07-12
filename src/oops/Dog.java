package oops;

public class Dog extends Dogs {
    void name() {
        System.out.println("Toki is Barking");
    }
    public static void main(String[] args){
        Dog t = new Dog();
        t.eat();
        t.bark();
        t.name();
    }
}

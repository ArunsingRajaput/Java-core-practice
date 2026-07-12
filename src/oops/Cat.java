package oops;

public class Cat extends Animal {
    @Override
     void eat(){
        super.eat();
        System.out.println("eating");
    }
    void sound() {
        System.out.println("Cat is Meows");
    }
    public static void main(String[] args){
        Cat c = new Cat();
        c.eat();
        c.sound();
    }
}


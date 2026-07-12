package oops;

public class Dogs extends Animal {
    void bark(){
        System.out.println("Dogs are Barking");
    }

    public static void main(String[] args){
        Dogs d = new Dogs();
        d.eat();
        d.bark();
    }
}


package oops;

public class Bike extends Vehicle {
    @Override
    void start(){
        System.out.println("Bike Start");
    }

    public static void main(String[] args){
        Vehicle v = new Bike();
        v.start();
    }
}

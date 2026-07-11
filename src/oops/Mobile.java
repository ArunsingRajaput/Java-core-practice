package oops;

public class Mobile {
    String brand;
    String model;
    double price;

    void display(){
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Price : "+price);
    }

    public static void main(String[] args){

        Mobile m = new Mobile();
        m.brand = "Oppo";
        m.model = "Reno 14";
        m.price = 40000;
        m.display();
    }
}

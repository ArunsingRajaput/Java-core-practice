package oops;

public class Circle {
    double radius;

    double area(){
//        return 3.14 * radius * radius;
        return Math.PI * radius * radius;
    }
    public static void main(String[] args){
        Circle c = new Circle();
        c.radius = 5;
        System.out.println("Area of Circle : "+c.area());
    }
}

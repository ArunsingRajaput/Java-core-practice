package oops;

public class Circle extends Shape {
    double radius;
    @Override
    double area(){
        return Math.PI * radius * radius;
    }
    public static void main(String[] args){
        Circle c = new Circle();
        c.radius = 5;
        System.out.println("Area of Circle : "+c.area());
    }
}

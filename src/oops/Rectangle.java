package oops;

public class Rectangle {
    double length;
    double width;

    double area(){
        return length * width;
    }

    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.width = 5;
        r.length = 5;
        System.out.println("Area of Rectangle : "+r.area());
    }
}


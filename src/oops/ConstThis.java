package oops;

public class ConstThis {
    String title;
    String author;
    double price;

    ConstThis(){
        this("Untitled","Unknown",0.0);
    }
    ConstThis(String title,String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display(){
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Price : "+price);
    }

    public static void main(String[] args){
        ConstThis a1 = new ConstThis();
        ConstThis a2 = new ConstThis("History","Arun",500);
        a1.display();
        System.out.println();
        a2.display();
    }
}

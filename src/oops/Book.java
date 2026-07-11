package oops;

public class Book {
    String title;
    String author;
    double price;

    void display(){

        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Price : "+price);
    }

    public static void main(String[] args){
        Book b = new Book();
        b.title = "History of Java";
        b.author = "Arun Rajaput";
        b.price = 500;

        b.display();
    }
}

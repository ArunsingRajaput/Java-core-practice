package oops;

public class Student {
    String name;
    int age;

    public Student(){
        name = "Arun";
        age = 21;
        System.out.println("Student object created.");
    }

    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }

    public static void main(String[] args){
        Student s1 = new Student();
        s1.display();
    }
}

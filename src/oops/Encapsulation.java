package oops;

public class Encapsulation {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age.");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        Encapsulation s = new Encapsulation();

        s.setName("Arun");
        s.setAge(-21);

        System.out.println("Name : " + s.getName());
        System.out.println("Age : " + s.getAge());
    }
}
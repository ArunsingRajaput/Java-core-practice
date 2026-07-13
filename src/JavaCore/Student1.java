package JavaCore;

final class Student1 {
    String name = "Arun";
    final int age = 21;
    
    final void diplay(){
        System.out.println("welcome");
    }
    
    public static void main(String[] args){
        Student1 s = new Student1();
        System.out.println(s.name);
        System.out.println(s.age);
        s.diplay();
    }
}

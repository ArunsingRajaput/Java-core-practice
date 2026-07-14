package exceptionhandling;

public class ThrowsDemo {

    static void checkAge(int age) throws Exception {

        if (age < 18) {
            throw new Exception("Not Eligible to Vote");
        }

        System.out.println("Eligible to Vote");
    }

    public static void main(String[] args) {

        try {
            checkAge(16);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
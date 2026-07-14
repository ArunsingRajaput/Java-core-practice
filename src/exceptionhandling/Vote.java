package exceptionhandling;

public class Vote {

    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }

        System.out.println("Eligible to Vote");
    }

    public static void main(String[] args) {

        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
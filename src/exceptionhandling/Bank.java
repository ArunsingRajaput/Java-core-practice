package exceptionhandling;

public class Bank {

    public static void main(String[] args) {

        int balance = 500;

        try {

            if (balance < 1000) {
                throw new ArithmeticException("Insufficient Balance");
            }

            System.out.println("Transaction Successful");

        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());
        }
    }
}
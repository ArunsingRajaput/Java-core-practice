package exceptionhandling;

public class Bank1 {

    static void withdraw(int balance)
            throws InsufficientBalanceException {

        if(balance < 1000) {

            throw new InsufficientBalanceException(
                    "Insufficient Balance");
        }

        System.out.println("Transaction Successful");
    }

    public static void main(String[] args) {

        try {

            withdraw(500);

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());
        }
    }
}
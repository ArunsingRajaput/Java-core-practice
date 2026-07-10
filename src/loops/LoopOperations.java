package loops;

public class LoopOperations {

    // For Loop
    public void forLoop(int n) {

        System.out.println("For Loop:");

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
    }


    // While Loop
    public void whileLoop(int n) {

        System.out.println("While Loop:");

        int i = 1;

        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();
    }


    // Do While Loop
    public void doWhileLoop(int n) {

        System.out.println("Do While Loop:");

        int i = 1;

        do {
            System.out.print(i + " ");
            i++;
        } while (i <= n);

        System.out.println();
    }


    // Sum of Numbers
    public int sum(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }


    // Factorial
    public int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }
}
package loops;

public class LoopPatterns {


    // Star Pattern
    public void starPattern(int n) {

        System.out.println("Star Pattern:");

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }


    // Number Pattern
    public void numberPattern(int n) {

        System.out.println("Number Pattern:");

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }


    // Multiplication Table
    public void table(int n) {

        System.out.println("Multiplication Table:");

        for (int i = 1; i <= 10; i++) {

            System.out.println(
                    n + " x " + i + " = " + (n * i)
            );
        }
    }


    // Reverse Number
    public int reverse(int n) {

        int rev = 0;

        while (n > 0) {

            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;

        }

        return rev;
    }
}
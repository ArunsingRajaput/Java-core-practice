package loops;

public class Main3 {
    public static void main(String[] args) {

        LoopOperations loop = new LoopOperations();
        LoopPatterns pattern = new LoopPatterns();
        loop.forLoop(5);
        loop.whileLoop(5);
        loop.doWhileLoop(5);
        System.out.println("Sum = " + loop.sum(10));
        System.out.println("Factorial = " + loop.factorial(5));
        pattern.starPattern(5);
        pattern.numberPattern(5);
        pattern.table(7);
        System.out.println("Reverse Number = " + pattern.reverse(12345));
    }
}
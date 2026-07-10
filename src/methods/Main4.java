package methods;

public class Main4 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        MethodOperations.hello();
        MethodOperations.square(5);

        MethodOperations.isEven(10);
        System.out.println("Addition : " + MethodOperations.add(10,20));
        System.out.println("Maximum : " + MethodOperations.max(50,30));
        System.out.println("Is Prime : " + MethodOperations.isPrime(17));
        System.out.println("Search 40 Index : " + MethodSearching.binarySearch(arr,40));
        System.out.println("Search 15 Index : " + MethodSearching.binarySearch(arr,15));
    }
}
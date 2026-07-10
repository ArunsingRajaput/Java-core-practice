package arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        Operations operations = new Operations();
        SumMultiply sumMultiply = new SumMultiply();
        Search search = new Search();
        Reverse reverse = new Reverse();

        System.out.println("Original Array:");
        operations.printArray(arr);

        System.out.println("Sum = " + sumMultiply.findSum(arr));
        System.out.println("Product = " + sumMultiply.findProduct(arr));

        if (search.searchElement(arr, 30)) {
            System.out.println("30 Found");
        } else {
            System.out.println("30 Not Found");
        }

        System.out.println("Reversed Array:");
        reverse.reverseArray(arr);
    }
}
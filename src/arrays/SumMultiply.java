package arrays;

public class SumMultiply {

    public int findSum(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return sum;
    }

    public int findProduct(int[] arr) {
        int product = 1;

        for (int num : arr) {
            product *= num;
        }

        return product;
    }
}
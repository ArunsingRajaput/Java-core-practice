package methods;

public class MethodSearching {

    public static int binarySearch(int[] arr, int target) {
        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {
            int m = l + (h - l) / 2;
            if (target == arr[m]) {
                return m;
            } else if (target < arr[m]) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }
}
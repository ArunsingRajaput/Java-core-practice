package arrays;

public class Search {

    public boolean searchElement(int[] arr, int key) {

        for (int num : arr) {
            if (num == key) {
                return true;
            }
        }

        return false;
    }
}
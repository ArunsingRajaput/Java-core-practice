package leetcode;

public class Best_time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        int x =0;
        if (x == 0 || x == 1) {
            return x;
        }

        int left = 1;
        int right = x;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if ((long) mid * mid == x) {
                return mid;
            } else if ((long) mid * mid < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }


        return 0;
    }

    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};

        Best_time_to_Buy_and_Sell_Stock bs = new Best_time_to_Buy_and_Sell_Stock();
        int[] ans = new int[]{bs.maxProfit(prices)};
        System.out.println(ans);

    }

}

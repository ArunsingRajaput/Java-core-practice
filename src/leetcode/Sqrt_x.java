package leetcode;

public class Sqrt_x {
        public int mySqrt(int x) {
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

            return ans;
        }

        public static void main(String[] args){
            int x = 8;

            Sqrt_x sq = new Sqrt_x();
            System.out.println(sq.mySqrt(x));
        }
}

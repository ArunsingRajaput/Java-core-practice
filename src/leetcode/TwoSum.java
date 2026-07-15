package leetcode;
import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> num = new HashMap<>();
            int ans = 0;

            for(int i=0;i<nums.length;i++) {
                int need = target - nums[i];

                if(num.containsKey(need)) {
                    return new int[]{num.get(need),i};
                }
                num.put(nums[i],i);
            }
            return null;
        }

        public static void main(String[] args){
            int[] nums = {2,7,11,15};
            int target = 9;

            TwoSum t = new TwoSum();
            int[] ans = t.twoSum(nums,target);
            System.out.println(Arrays.toString(ans));
        }

}

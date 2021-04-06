package problem53_maxSubArray;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/4/2-15:52
 * @Since:jdk1.8
 * @Description:TODO
 */
public class Solution {
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                max = max >= sum ? max : sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "";

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("maxSubArray(nums) = " + maxSubArray(nums));
    }
}
package problem8_removeDuplicates;

import java.util.Arrays;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/3/28-19:19
 * @Since:jdk1.8
 * @Description:TODO
 */
public class Solution {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 0;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        nums = Arrays.copyOf(nums, i + 1);
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("removeDuplicates(nums) = " + removeDuplicates(nums));
    }
}
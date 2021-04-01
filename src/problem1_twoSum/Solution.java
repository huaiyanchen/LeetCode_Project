package problem1_twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            //如果一个hashmap中包含了 目标值-当前值
            //那么这个数组中就有两个数的和是target
            //hashmap有序
            //containsKeys containsValue  顾名思义是否包含  返回值是bool类型
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }


    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5, 6};
        int m = 7;
        System.out.println("Arrays.toString(twoSum(n, m)) = " + Arrays.toString(twoSum(n, m)));
        System.out.println("Arrays.toString(twoSum2(n, m)) = " + Arrays.toString(twoSum2(n, m)));

    }
}


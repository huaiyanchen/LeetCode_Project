package problem167_twoSum;

import java.util.Arrays;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/4/4-20:39
 * @Since:jdk1.8
 * @Description:
 */
class Solution {
    public static int[] twoSum1(int[] numbers, int target) {
        int length = numbers.length;
        //二分法  蠢的离谱

        for (int i = 0; i < length; ++i) {
            int l = i + 1, r = length - 1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (numbers[mid] == target - numbers[i]) {
                    return new int[]{i + 1, mid + 1};
                } else if (numbers[mid] > target - numbers[i]) {
                    r = mid - 1;
                } else if (numbers[mid] < target - numbers[i]) {
                    l = mid + 1;
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] twoSum2(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; ++i) {
            int l = i + 1, r = numbers.length - 1;
            while (l <= r) {
                int mid = (r - l) / 2 + l;
                if (numbers[mid] == target - numbers[i]) {
                    return new int[]{i + 1, mid + 1};
                } else if (numbers[mid] > target - numbers[i]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return new int[]{-1, -1};
    }


    public static void main(String[] args) {
        int[] ints = new int[]{2, 3, 4};
        int t = 6;
        System.out.println("twoSum1(ints, t) = " + Arrays.toString(twoSum1(ints, t)));
        System.out.println("twoSum2(ints, t) = " + Arrays.toString(twoSum2(ints, t)));
    }
}
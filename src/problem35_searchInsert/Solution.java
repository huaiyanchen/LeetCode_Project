package problem35_searchInsert;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/3/29-22:52
 * @Since:jdk1.8
 * @Description:TODO
 */
public class Solution {
    public static int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int l = 0, r = len - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid;

            }
        }
        return l;

    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int target = 5;
        int i = searchInsert(nums, target);
        System.out.println(i);
    }
}
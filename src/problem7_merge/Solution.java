package problem7_merge;


import java.util.*;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/3/25-22:02
 * @Since:jdk1.8
 * @Description:TODO
 */
public class Solution extends Object{
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m+n];
        int i = 0, j = 0;
        int k = 0;
        while (i < m && j < n) {
            temp[k++] = nums1[i] <= nums2[j] ? nums1[i++] : nums2[j++];
        }
        while (i < m) {
            temp[k++] = nums1[i++];
        }
        while (j < n) {
            temp[k++] = nums2[j++];
        }
        nums1 = temp;
        System.out.println("nums1.equals(temp) = " + Arrays.equals(nums1, temp));
        System.out.println(Arrays.toString(nums1));

    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge3(int[] nums1, int m, int[] nums2, int n) {
        int[] sort = new int[m + n];
        Map<Integer, String> map = new HashMap<>();
        String s = "";

    }




    public static void main(String[] args) {
        int[] ms1 = {1, 2, 3, 0, 0, 0};
        int[] ms2 = {2, 5, 6};
        merge(ms1, 3, ms2, 3);
//        merge2(ms1, 3, ms2, 3);
       // System.arraycopy(ms2, 0, ms1, 3, 3);
//
//        System.out.println(Arrays.toString(ms1));
//        System.out.println(Arrays.toString(ms2));

    }
}
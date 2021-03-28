package problem6_isValid;

import java.util.*;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/3/24-21:18
 * @Since:jdk1.8
 * @Description:TODO 还是不会  淦
 * HashMap不会用 Deque不懂不会用 !!!
 */

public class Solution {
    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        if (chars.length % 2 != 0) {
            return false;
        }
        char[] pops = new char[100];
        int cur = 1;
        for (int i = 0; i < chars.length; i++) {
            if (pops[cur] != chars[i]) {
                pops[cur] = chars[i];
                cur++;
            } else if (pops[cur] == chars[i]) {
                cur -= 2;
            }
        }
        if (cur == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValid2(String s) {
        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || !stack.peek().equals(pairs.get(ch))) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
//        String s = "()[]{}";
//        System.out.println("isValid(s) = " + isValid(s));
//        System.out.println("isValid2(s) = " + isValid2(s));
        /**
         * 选择排序 :
         * 遍历出第二层的最小或者最大的
         *  与第一层循环的第一个比较互换
         */
        /**
         * 插入排序
         * 后一个与前一个比较 如果后一个大,后移
         * 直到比前一个小或者相等跳出本次循环
         * 执行插入操作
         */
        /**
         * 冒泡排序:
         * 第一次循环把最大的(最小的)循环到最后面的位置
         * 第二次是第二大(第二小)的
         * 最后就是从小到大 或者是从大到小
         */
        int[] nums = {5, 2, 3, 5, 1, 7};
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            int j;
            for (j = i - 1; j >=0; j--) {
                if (nums[j] > num) {
                    nums[j + 1] = nums[j];
                }
                else {
                    break;
                }
            }
            nums[j + 1] = num;
        }
        System.out.println("nums.toString() = " + Arrays.toString(nums));
    }
}

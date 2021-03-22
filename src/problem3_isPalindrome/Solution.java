package problem3_isPalindrome;

public class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int pop = 0;
        //时间复杂度为 logn
        // while循环中  一步步赋值pop  当pop比x大时,程序结束.

        while (x > pop|| (x % 10 == 0 && x != 0)) {
            pop = pop * 10 + x % 10;
            x /= 10;

        }
        //关键点:x==pop/10  判断x为奇数时,去除最后一位让他何x去掉的部分做比较
        return x == pop || x ==pop / 10;
    }

    /**
     *  @author: chy
     *  @Date: 2021/3/22 15:15
     *  @Description: 直接反转  reverse
     */
    public static boolean isPalindrome2(int x) {
        int fin = x;
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            rev = rev * 10 + pop;

        }
        return fin == rev;
    }



    public static void main(String[] args) {
        int x = 12321;
        System.out.println("isPalindrome(x) = " + isPalindrome(x));
        System.out.println("isPalindrome2(x) = " + isPalindrome2(x));
    }
}

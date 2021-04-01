/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/3/30-22:35
 * @Since:jdk1.8
 * @Description:TODO
 */
class Solution {
    public static int mySqrt(int x) {
        int l = 0, r = x;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                l = mid+1;
            } else {
                r = mid -1;
            }
        }
        return l-1;
    }

    public static void main(String[] args) {
        int x = 8;
        System.out.println("mySqrt(8) = " + mySqrt(8));
    }
}
package problem2_reverse;


public class Solution {
    public static  int reverse(int x) {
        String s = String.valueOf(x);
        String s2 = new StringBuffer(s).reverse().toString();
        return Integer.parseInt(s2);
    }
    public static  int reverse2(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            //判断  rev = rev * 10 + pop 这句会不会溢出,就是判断0x80000000 /10 < rev < 0x7fffffff
            //自己疑惑的点 1 :  7和-8
            //              通过debug发现 / 会导致最后一位的判断会导致有可能int类型的溢出
            //              int的取值范围是 - 2 *  31~ 2 * 31 - 1  就是-2147483648~2147483647
             if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
            {return 0;}
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
            { return 0;}

            rev = rev * 10 + pop;
        }
        return rev;

    }

    public static void main(String[] args) {
        int x = 12345;
//        System.out.println("reverse(x) = " + reverse(x));
        System.out.println("reverse2(x) = " + reverse2(x));
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

    }
}

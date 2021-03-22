package problem4_romanToInt;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/3/22-16:20
 * @Since:jdk1.8
 * @Description:
 *
 * 罗马数字由 I,V,X,L,C,D,M 构成；
 * 当小值在大值的左边，则减小值，如 IV=5-1=4；
 * 当小值在大值的右边，则加小值，如 VI=5+1=6；
 * 由上可知，右值永远为正，因此最后一位必然为正。

 */
public class Solution {
    public static int romanToInt(String s) {
        int sum = 0;
        int result = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int before = getValue(s.charAt(i));
            if (before > result) {
                sum -= result;
            } else {
                sum += result;
            }
            result = before;
        }

        //循环到最后加上之后一个值
        //一定要记住!!!
        sum += result;

        return sum;
    }

    public static int romanToInt2(String s) {
        int sum = 0;
        int preNum = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int num = getValue(s.charAt(i));
            if (preNum < num) {
                sum -= preNum;
            } else {
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;

    }

    private static int getValue(char ch) {
        switch (ch) {
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default:
                throw new IllegalStateException("Unexpected value: " + ch);
        }
    }

    public int romanToInt3(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        int ans = 0;
        for(int i = 0;i < s.length();) {
            if(i + 1 < s.length() && map.containsKey(s.substring(i, i+2))) {
                ans += map.get(s.substring(i, i+2));
                i += 2;
            } else {
                ans += map.get(s.substring(i, i+1));
                i ++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "IV";
        System.out.println("romanToInt(s) = " + romanToInt(s));
        System.out.println("romanToInt(s)2 = " + romanToInt2(s));
    }
}

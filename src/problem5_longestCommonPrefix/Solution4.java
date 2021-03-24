package problem5_longestCommonPrefix;

import java.math.BigInteger;
import java.util.Properties;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/3/22-22:40
 * @Since:jdk1.8
 * @Description: 纵向
 */
public class Solution4 {
    public String longestCommonPrefix(String[] strs) {
        int count = strs.length;
        int length = strs[0].length();
        for (int i = 0; i < length; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < count; j++) {
                if (c == strs[j].charAt(i)) {
/**
 *
 *  非常人所能写 shit
 *   todo
 */
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        String s = new BigInteger("20", 10).toString(2);
        System.out.println(s);

        Properties properties = System.getProperties();
        properties.list(System.out);

        char c = (char) (Math.random() * 26 + 97);
        double r = Math.random();
        System.out.println("r = " + r);
        System.out.println(c);

    }

}

package problem5_longestCommonPrefix;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/3/23-22:24
 * @Since:jdk1.8
 * @Description:横向
 */
public class Solution5 {
    public String longestCommonPrefix(String[] strs) {

        int length = strs.length;
        String prefix = strs[0];
        for (int i = 1; i < length; i++) {
            prefix = longestCommonPrefix(prefix, strs[i]);
        }
        return prefix;
    }

    public String longestCommonPrefix(String s1, String s2) {
        if (s1.length() == 0 || s2.length() == 0) {
            return "";
        }

        int len = Math.min(s1.length(), s2.length());

        for (int i = 0; i < len; i++) {

            //这里不是最长的前缀

            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.substring(0, i);
            }
        }
        return s1.substring(0, len);
    }
}

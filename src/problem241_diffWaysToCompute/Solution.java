package problem241_diffWaysToCompute;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/4/7-21:58
 * @Since:jdk1.8
 * @Description:
 */
public class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res = new LinkedList<>();


        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i + 1));
                for (int a : left) {
                    for (int b : right) {
                        if (c == '+') {
                            res.add(a + b);
                        }
                        if (c == '-') {
                            res.add(a - b);
                        }
                        if (c == '*') {
                            res.add(a * b);
                        }
                    }
                }
            }
        }
        if (res.isEmpty()) {
            res.add(Integer.parseInt(expression));
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "2 * 3-4 * 5";
        String s1 = "2 - 1 - 1";
        System.out.println("new Solution().diffWaysToCompute(s) = " + new Solution().diffWaysToCompute(s1));
        HashMap<Integer, String> map = new HashMap<>();
        String put = map.put(11, "123");
        System.out.println(put);
    }

}

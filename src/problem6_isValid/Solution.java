package problem6_isValid;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

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
        String s = "()[]{}";
//        System.out.println("isValid(s) = " + isValid(s));
//        System.out.println("isValid2(s) = " + isValid2(s));

    }
}

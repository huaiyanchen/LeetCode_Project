package problem6_isValid;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/3/24-21:18
 * @Since:jdk1.8
 * @Description:TODO 还是不会  淦
 * HashMap不会用 Deque不懂不会用 !!!
 * <p>
 * 栈具有push()、pop()（返回栈顶元素并出栈）、peek() （返回栈顶元素不出栈）isEmpty()、size()这些基本的方法。
 * 3.28看懂了代码了 不容易啊   isValid2
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
        Stack<Character> stack = new Stack<Character>();
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

    public static boolean isValid3(String s) {
        Map<Character, Character> maps = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (maps.containsKey(ch)) {
                if (stack.isEmpty() || !stack.peek().equals(maps.get(ch))) {
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
        String s = "()[{}]{}";
//        System.out.println("isValid(s) = " + isValid(s));
        System.out.println("isValid2(s) = " + isValid2(s));
        System.out.println("isValid3(s) = " + isValid3(s));
    }
}

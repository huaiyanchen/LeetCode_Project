package problem3_isPalindrome;

public class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int pop = 0;
        while (x > pop|| (x % 10 == 0 && x != 0)) {
            pop = pop * 10 + x % 10;
            x /= 10;

        }
        return x == pop || x ==pop / 10;
    }

    public static void main(String[] args) {
        int x = 32123;
        System.out.println("isPalindrome(x) = " + isPalindrome(x));
    }
}

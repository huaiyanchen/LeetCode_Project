package problem5_longestCommonPrefix;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/3/22-21:59
 * @Since:jdk1.8
 * @Description:TODO
 */
public class Result {
    public static void main(String[] args) {
       String[] strings = {"flower", "flow", "flight"};
//        String[] strings = {"cir","car"};
        Solution solution = new Solution();
        Solution2 solution2 = new Solution2();
        Solution3 solution3 = new Solution3();
        Solution4 solution4 = new Solution4();
        Solution5 solution5 = new Solution5();

        System.out.println("solution.longestCommonPrefix(strings) = " + solution.longestCommonPrefix(strings));
        System.out.println("solution2.longestCommonPrefix(strings) = " + solution2.longestCommonPrefix(strings));
        System.out.println("solution3.longestCommonPrefix(strings) = " + solution3.longestCommonPrefix(strings));
        System.out.println("solution4.longestCommonPrefix(strings) = " + solution4.longestCommonPrefix(strings));
        System.out.println("solution5.longestCommonPrefix(strings) = " + solution5.longestCommonPrefix(strings));

    }
}

package problem74_searchMatrix;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/3/30-21:28
 * @Since:jdk1.8
 * @Description:TODO
 */
class Solution {
    //baoli
    public static boolean searchMatrix1(int[][] matrix, int target) {
        boolean b = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    b = true;
                }

            }
        }
        if (b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int l = 0, r = m-1;
        // 二分查找：在第0列中二分，找到小于target的最接近的元素，记录行号row
        int row = 0;
        while (l <= r) {
            int mid = l + (r-l)/2;
            int cur = matrix[mid][0];
            if (cur == target) return true;
            else if (cur < target) {
                row = mid;
                l = mid + 1;
            } else { // cur > target
                r = mid - 1;
            }
        }
        // 二分查找：在第row行中二分，找target是否存在
        l = 1;
        r = n-1;
        while (l <= r) {
            int mid = l + (r-l)/2;
            int cur = matrix[row][mid];
            if (cur == target) return true;
            else if (cur < target) l = mid + 1;
            else r = mid - 1;
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix =
                {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 4;
        System.out.println(searchMatrix(matrix, target));


    }
}
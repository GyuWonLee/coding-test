import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] arr) {
        int numRows = arr.length;
        int numCols = arr[0].length;
        int[][] result;

        if (numRows > numCols) {
            result = new int[numRows][numRows];
            for (int i = 0; i < numRows; i++) {
                result[i] = Arrays.copyOf(arr[i], numRows);
            }
        } else if (numCols > numRows) {
            result = new int[numCols][numCols];
            for (int i = 0; i < numRows; i++) {
                result[i] = Arrays.copyOf(arr[i], numCols);
            }
        } else {
            return arr;
        }

        return result;
    }
}

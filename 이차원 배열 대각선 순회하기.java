class Solution {
    public int solution(int[][] board, int k) {
        int sum = 0;
        int n = board.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i + j <= k) {
                    sum += board[i][j];
                }
            }
        }

        return sum;
    }
}
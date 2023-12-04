class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int value = 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (value <= n * n) {
            // 위쪽 행
            for (int i = left; i <= right; i++) {
                answer[top][i] = value++;
            }
            top++;

            // 오른쪽 열
            for (int i = top; i <= bottom; i++) {
                answer[i][right] = value++;
            }
            right--;

            // 아래쪽 행
            for (int i = right; i >= left; i--) {
                answer[bottom][i] = value++;
            }
            bottom--;

            // 왼쪽 열
            for (int i = bottom; i >= top; i--) {
                answer[i][left] = value++;
            }
            left++;
        }

        return answer;
    }
}
class Solution {
    public int solution(int[][] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 대칭 행렬이 아닌 경우
                if (arr[i][j] != arr[j][i]) {
                    return 0;
                }
            }
        }

        // 모든 요소가 대칭인 경우
        return 1;
    }
}
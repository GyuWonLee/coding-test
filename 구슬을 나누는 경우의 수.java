class Solution {
    public int solution(int balls, int share) {
        // 주어진 balls 중에서 share 개의 구슬을 선택하는 경우의 수를 반환
        return combinations(balls, share);
    }

    private int combinations(int n, int r) {
        if (r == 0 || n == r) {
            return 1;
        } else {
            return combinations(n - 1, r - 1) + combinations(n - 1, r);
        }
    }
}
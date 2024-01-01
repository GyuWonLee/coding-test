class Solution {
    public int solution(int[] box, int n) {
        // 상자의 가로, 세로, 높이 중 가장 작은 길이를 구합니다.
        int minSize = Math.min(box[0], Math.min(box[1], box[2]));

        // 주어진 모서리의 길이로 상자의 한 변에 들어갈 수 있는 주사위의 개수를 계산합니다.
        int countPerSide = minSize / n;

        // 주사위의 총 개수를 계산하여 반환합니다.
        return countPerSide * countPerSide * countPerSide;
    }
}
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int length = numbers.length;
        int[] rotated = new int[length];

        // 오른쪽으로 회전하는 경우
        if (direction.equals("right")) {
            for (int i = 0; i < length; i++) {
                rotated[(i + 1) % length] = numbers[i];
            }
        }
        // 왼쪽으로 회전하는 경우
        else if (direction.equals("left")) {
            for (int i = 0; i < length; i++) {
                rotated[i] = numbers[(i + 1) % length];
            }
        }

        return rotated;
    }
        
}
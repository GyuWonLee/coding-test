import java.util.Arrays;

class Solution {
   public int solution(int[] numbers) {
        // 배열을 정렬합니다.
        Arrays.sort(numbers);

        // 가장 큰 두 수와 가장 작은 두 수를 구합니다.
        int n = numbers.length;
        int maxProduct = Math.max(numbers[0] * numbers[1], numbers[n - 2] * numbers[n - 1]);

        return maxProduct;
    }
}
import java.util.Arrays;

public class Solution {
    public static int[] solution(int[] arr) {
        // 주어진 배열의 길이
        int length = arr.length;

        // 추가해야 할 0의 개수 계산
        int zerosToAdd = nextPowerOfTwo(length) - length;

        // 새로운 배열 생성 및 기존 배열 복사
        int[] newArr = Arrays.copyOf(arr, length + zerosToAdd);

        // 추가된 부분에 0 채우기
        for (int i = length; i < newArr.length; i++) {
            newArr[i] = 0;
        }

        return newArr;
    }

    // 다음으로 가장 가까운 2의 거듭제곱 구하기
    private static int nextPowerOfTwo(int n) {
        int power = 1;
        while (power < n) {
            power *= 2;
        }
        return power;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] result = solution(arr);

        System.out.println(Arrays.toString(result));
    }
}

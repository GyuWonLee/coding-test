public class Solution {
    public static int solution(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;

        // 1. 배열의 길이 비교
        if (len1 != len2) {
            return Integer.compare(len1, len2);
        }

        // 2. 배열의 길이가 같은 경우, 각 배열의 합 비교
        int sum1 = calculateSum(arr1);
        int sum2 = calculateSum(arr2);

        return Integer.compare(sum1, sum2);
    }

    // 배열의 합 계산
    private static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7};

        int result = solution(arr1, arr2);
        System.out.println(result);
    }
}

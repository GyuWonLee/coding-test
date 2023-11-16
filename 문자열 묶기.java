public class Solution {

    public static int solution(String[] strArr) {
        // 각 길이별 그룹의 크기를 저장할 배열
        int[] groupSizes = new int[101]; // 최대 문자열 길이는 100이라 가정

        // 문자열 배열을 순회하면서 각 문자열의 길이를 기준으로 그룹화
        for (String str : strArr) {
            int length = str.length();
            groupSizes[length]++;
        }

        // 가장 큰 그룹의 크기 찾기
        int maxGroupSize = 0;
        for (int size : groupSizes) {
            maxGroupSize = Math.max(maxGroupSize, size);
        }

        return maxGroupSize;
    }

    public static void main(String[] args) {
        // 예시 입력
        String[] strArr = {"abc", "def", "ghi", "123", "456", "789"};

        // solution 함수 호출 및 결과 출력
        int result = solution(strArr);
        System.out.println("가장 큰 그룹의 크기: " + result);
    }
}
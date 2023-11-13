import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int num : arr) {
            if (!uniqueNumbers.contains(num)) {
                result.add(num);
                uniqueNumbers.add(num);
            }
        }

        // 나머지 부분 -1로 채우기
        while (result.size() < k) {
            result.add(-1);
        }

        // 리스트를 배열로 변환
        int[] finalResult = new int[k];
        for (int i = 0; i < k; i++) {
            finalResult[i] = result.get(i);
        }

        return finalResult;
    }
}

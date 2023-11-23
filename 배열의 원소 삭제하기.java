import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] deleteList = {2, 4};

        int[] result = solution(arr, deleteList);

        // 결과 출력
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] arr, int[] deleteList) {
        List<Integer> resultList = new ArrayList<>();

        for (int element : arr) {
            if (!contains(deleteList, element)) {
                resultList.add(element);
            }
        }

        // ArrayList를 배열로 변환
        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }

    // 배열에서 특정 원소가 포함되어 있는지 확인하는 메서드
    public static boolean contains(int[] arr, int target) {
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}

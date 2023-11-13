import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // 리스트를 활용하여 결과를 만들기 위해 리스트를 선언합니다.
        List<Integer> list = new ArrayList<>();
        
        // 입력된 배열 arr을 순회합니다.
        for (int a : arr) {
            // 배열의 각 원소를 확인하며 해당 숫자를 그 숫자만큼 리스트에 추가합니다.
            for (int i = 0; i < a; i++) {
                list.add(a);
            }
        }
        
        // 결과를 담을 배열을 리스트의 크기로 초기화합니다.
        int[] result = new int[list.size()];
        
        // 리스트에 저장된 값을 배열에 복사합니다.
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        // 결과 배열을 반환합니다.
        return result;
    }
}
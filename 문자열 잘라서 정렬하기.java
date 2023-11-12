import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public String[] solution(String myString) {
        String[] splitArr = myString.split("x");
        ArrayList<String> nonEmptyStrings = new ArrayList<>();

        // 빈 문자열 제거
        for (String str : splitArr) {
            if (!str.isEmpty()) {
                nonEmptyStrings.add(str);
            }
        }

        // ArrayList를 배열로 변환
        String[] result = nonEmptyStrings.toArray(new String[0]);

        // 배열을 사전순으로 정렬
        Arrays.sort(result);

        return result;
    }
}
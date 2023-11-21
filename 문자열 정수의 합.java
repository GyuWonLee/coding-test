class Solution {
    public int solution(String num_str) {
        int answer = 0;

        for (int i = 0; i < num_str.length(); i++) {
            // 각 자리의 문자를 정수로 변환하여 더하기
            try {
                answer += Integer.parseInt(num_str.substring(i, i + 1));
            } catch (NumberFormatException e) {
                // 만약 변환 중에 예외가 발생하면(숫자로 변환할 수 없는 문자가 포함된 경우)
                // 여기서는 간단히 예외를 무시하고 다음 자리로 진행
            }
        }

        return answer;
    }
}
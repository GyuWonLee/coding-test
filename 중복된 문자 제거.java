class Solution {
    public String solution(String my_string) {
        StringBuilder resultBuilder = new StringBuilder();
        
        for (char c : my_string.toCharArray()) {
            // 결과에 해당 문자가 없으면 추가
            if (resultBuilder.indexOf(String.valueOf(c)) == -1) {
                resultBuilder.append(c);
            }
        }

        return resultBuilder.toString();
    }
}
class Solution {
    public int solution(String s) {
        String[] sArray = s.split(" ");
        int result = 0;

        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i].equals("Z")) {
                // i가 0이면 이전에 더한 숫자가 없으므로 예외 처리
                if (i > 0) {
                    result -= Integer.parseInt(sArray[i - 1]);
                }
                continue;
            }

            result += Integer.parseInt(sArray[i]);
        }

        return result;
    }
}
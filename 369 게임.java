class Solution {
    public int solution(int order) {
        // 입력된 숫자를 문자열로 변환
        String orderStr = "" + order;
        int count = 0;
        
        for (int i = 0; i < orderStr.length(); i++) {
            // 현재 자리 숫자가 3, 6, 9 중 하나인지 확인
            if (orderStr.charAt(i) == '3' || orderStr.charAt(i) == '6' || orderStr.charAt(i) == '9') {
                count++;
            }
        }
        
        return count;
    }
}

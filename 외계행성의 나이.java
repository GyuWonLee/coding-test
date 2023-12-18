class Solution {
   public String solution(int age) {
        StringBuilder result = new StringBuilder();

        // 나이를 알파벳으로 변환
        while (age > 0) {
            int remainder = age % 10;
            char alphabet = (char) ('a' + remainder);
            result.insert(0, alphabet);
            age /= 10;
        }

        return result.toString();
    }
}
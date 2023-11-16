class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        for (int num: num_list) {
            while(1 < num) {
                num /= 2;
                answer++;
            }
        }

        return answer;
    }
}

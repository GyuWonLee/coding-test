import java.util.List;
import java.util.ArrayList;

class Solution{
    public int[] solution(int n){
        List<Integer> list = new ArrayList<>();

        // 자연수 n의 소인수를 구하기 위한 반복문
        for(int i = 2; i <= n; i++){

           if(n % i == 0){
               while(n % i == 0){
                   n /= i;
               }
               list.add(i);
           } 
        }
        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}

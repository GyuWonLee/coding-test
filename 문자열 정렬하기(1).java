import java.util.*;

class Solution {
    public ArrayList solution(String my_string) {
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for(int i=0; i<my_string.length(); i++){
            try {
                String num = my_string.substring(i, i+1);
                Double.parseDouble(num);
                answer.add(Integer.parseInt(num));
            } catch (NumberFormatException e) {

            }   
        }

        Collections.sort(answer);

        return answer;
    }
}

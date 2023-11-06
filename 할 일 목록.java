import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> result = new ArrayList<>();
        
        for(int i = 0; i < finished.length; i++){
            if(!finished[i]){
                result.add(todo_list[i]);
            }
        }
        
        String[] answer = new String[result.size()];
        answer = result.toArray(answer);
        
        return answer;
    }
}
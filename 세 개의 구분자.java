import java.util.*;

class Solution {
    public List<String> solution(String myStr) {
        List<String> list = new ArrayList<>();
        String[] substrings = myStr.split("[abc]");
        
        for (String substr : substrings) {
            if (!substr.isEmpty()) {
                list.add(substr);
            }
        }
        
        if (list.isEmpty()) {
            list.add("EMPTY");
        }
        
        return list;
    }
}
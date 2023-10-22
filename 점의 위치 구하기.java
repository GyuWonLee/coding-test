
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        if(dot[0] > 0 && dot[1] > 0){
            answer = 1;
        }else if(dot[0] > 0 && dot[1] < 0){
            answer = 4;
        }else if(dot[0] < 0 && dot[1] > 0){
            answer = 2;
        }else if(dot[0] < 0 && dot[1] < 0){
            answer = 3;
        }
        return answer;
    }
}

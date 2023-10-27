
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
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if(ineq.equals("<")){
            if(eq.equals("=")){
                if(n <= m){
                    answer = 1;
                } else {
                    answer = 0;
                }
            } else {
                if(n < m){
                    answer = 1;
                } else {
                    answer = 0;
                }
            }
        } else {
            if(eq.equals("=")){
                if(n >= m){
                    answer = 1;
                } else {
                    answer = 0;
                }
            } else {
                if(n > m){
                    answer = 1;
                } else {
                    answer = 0;
                }
            }
        }
        return answer;
    }
}
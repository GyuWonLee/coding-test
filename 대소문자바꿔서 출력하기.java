
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
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        for(int i = 0; i<a.length(); i++){
            char c = a.charAt(i);
            if(Character.isUpperCase(c)){
                answer += Character.toLowerCase(c);
            }else{
                answer += Character.toUpperCase(c);
            }
        }
       System.out.println(answer);
    }
}

import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        
        // 가장 긴 변
        int longestSide = sides[2];
        
        // 다른 두 변의 길이의 합
        int sumOfOtherTwoSides = sides[0] + sides[1];
        
        if (longestSide < sumOfOtherTwoSides){
            return 1;
        } else{
            return 2;
        }
        
    }
}
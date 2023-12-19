class Solution {
    public int solution(int hp) {
        int generalsNeeded = hp / 5;  // 장군개미의 수 계산
        int remainingHp = hp % 5;     // 남은 체력 계산
        
         int soldiersNeeded = 0; // 필요한 병력
        
        if ( remainingHp > 0 ){
            soldiersNeeded = remainingHp / 3; // 병정 개미수 계산
            remainingHp %= 3; 
        }
        
        // 남은 체력이 있을 경우, 일개미의 수도 계산
        if (remainingHp > 0) {
            soldiersNeeded += remainingHp;
        }

        // 총 필요한 개미의 수 반환
        return generalsNeeded + soldiersNeeded;
    }
        
}
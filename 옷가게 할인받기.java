class Solution {
    public int solution(int price) {
        if (price >= 500000) {
            return (int) (price - (price * 0.20));
        } else if (price >= 300000) {
            return (int) (price - (price * 0.10));
        } else if (price >= 100000) {
            return (int) (price - (price * 0.05));
        }
        return price;
    }
}
class Solution {
    public int digitFrequencyScore(int n) {
        int score = 0;
        
        
        if (n == 0) return 0;
        
        while (n > 0) {
            score += n % 10; 
            n /= 10;         
        }
        
        return score;
    }
}

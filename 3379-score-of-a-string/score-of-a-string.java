class Solution {
    public int scoreOfString(String s) {
        
        char[] ch = s.toCharArray();
        int sum = 0;

        for(int i = 0; i < ch.length - 1; i++){

            sum += Math.abs(ch[i] - ch[i + 1]);
        }

        return sum;
    }
}
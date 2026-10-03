class Solution {
    public int maxDistinct(String s) {
        
        int[] freq=new int[26];
        int count=0;

        for(int i = 0; i < s.length(); i++){
            char ch=s.charAt(i);
            freq[ch - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(freq[i] > 0){
                count++;
            }
        }
        return count;
    }
}
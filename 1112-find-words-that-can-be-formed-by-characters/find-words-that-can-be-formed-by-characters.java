class Solution {
    public int countCharacters(String[] words, String chars) {
        
        int[] freq = new int[26];

        for(char ch : chars.toCharArray()){
            freq[ch - 'a']++;
        }

        int ans = 0;

        for(String s : words){
            char[] str = s.toCharArray();
            int[] wFreq = new int[26];
            boolean found = true;

            for(char ch : str){
                wFreq[ch - 'a']++;

                if(freq[ch - 'a'] < wFreq[ch - 'a']){
                    found = false;
                }
            }
            if(found){
                ans += str.length;  
            }
        }

        return ans;
    }
}
class Solution {
    public boolean isVowel(char a)
    {
        return a=='a'||a=='e'||a=='i'||a=='o'||a=='u';
    }
    public int maxVowels(String s, int k) {
        int left = 0;
        int max = 0, vc = 0;

        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);

            if(isVowel(c)){
                vc++;
            }

            if(right - left + 1 > k){
                if(isVowel(s.charAt(left))) vc--;
                left++;
            }
            max = Math.max(max, vc);
        }
        return max;
    }
}
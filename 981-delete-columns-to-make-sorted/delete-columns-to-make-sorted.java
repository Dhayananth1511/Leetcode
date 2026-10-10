class Solution {
    public int minDeletionSize(String[] strs) {

        int n = strs.length;
        int m = strs[0].length();
        
        char[][] ch = new char[n][m];
        int i = 0;
        
        for(String s : strs){
            ch[i++] = s.toCharArray();
        }

        int ans = 0;

        for(int j = 0; j < m; j++){

            for(int k = 1; k < n; k++){
                
                if(ch[k][j] < ch[k - 1][j]){
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}
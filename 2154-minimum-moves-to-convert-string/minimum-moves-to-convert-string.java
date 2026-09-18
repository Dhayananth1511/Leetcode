class Solution {
    public int minimumMoves(String s) {

        char[] arr = s.toCharArray();
        int ans = 0;
        int i = 0;

        while (i < arr.length) {

            if (arr[i] == 'X') {
                ans++;
                i += 3;
            } else {
                i++;
            }
        }

        return ans;
    }
}
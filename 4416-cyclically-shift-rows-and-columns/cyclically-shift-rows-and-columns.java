class Solution {
    public int[][] cyclicShift(int n,int[][] grid, int[] rowShift, int[] colShift) {
       
       
        int[][] temp = new int[n][n];
        for (int i = 0; i < n; i++) {
            int k = rowShift[i] % n;
            for (int j = 0; j < n; j++) {
                int newJ = (j - k + n) % n;
                temp[i][newJ] = grid[i][j];
            }
        }
        
      
        int[][] result = new int[n][n];
        for (int j = 0; j < n; j++) {
            int k = colShift[j] % n;
            for (int i = 0; i < n; i++) {
                int newI = (i - k + n) % n;
                result[newI][j] = temp[i][j];
            }
        }
        
        return result;
    }
}

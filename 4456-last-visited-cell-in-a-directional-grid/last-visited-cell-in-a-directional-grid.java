class Solution {
    public int[] lastVisitedCell(char[][] grid) {

        if(grid[0][0] == 'L' || grid[0][0] == 'U') return new int[]{0, 0};

        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];
        Queue<Character> queue = new ArrayDeque();
        queue.offer(grid[0][0]);
        visited[0][0] = true;

        int r = 0, c = 0;

        while(!queue.isEmpty()){
            
            char ch = queue.poll();

            int nc = c, nr = r;

            if(ch == 'R'){
                nc++;
            }
            else if(ch == 'L'){
                nc--;
            }
            else if(ch == 'U'){
                nr--;
            }
            else{
                nr++;
            }

            if(nr < 0 || nr > n - 1 || nc < 0 || nc > m - 1){
                break;
            }
            
            if(visited[nr][nc]){
                break;
            } 

            r = nr;
            c = nc;

            visited[r][c] = true;
            queue.offer(grid[r][c]);
            
        }
        return new int[]{r, c};

        
    }
}
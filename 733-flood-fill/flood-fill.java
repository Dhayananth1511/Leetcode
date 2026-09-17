class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;
        fill(image,sr,sc,color,image[sr][sc]);
        return image;
    }
    public void fill(int [][]image,int sr,int sc,int c,int cur)
    {
        if(sr<0 || sr>= image.length || sc<0 || sc>= image[0].length ||cur!=image[sr][sc]) return;

        image[sr][sc]=c;

        fill(image,sr-1,sc,c,cur);
        fill(image,sr+1,sc,c,cur);
        fill(image,sr,sc-1,c,cur);
        fill(image,sr,sc+1,c,cur);
    }
}
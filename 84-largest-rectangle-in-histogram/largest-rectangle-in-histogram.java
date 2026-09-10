class Solution {
    public static int[] pse(int [] arr)
    {
        int lb[]=new int[arr.length];
        Arrays.fill(lb,0);
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(!s.isEmpty() && arr[s.peek()]>=arr[i])
            {
                s.pop();
            }
            if(!s.isEmpty())
            {
                lb[i]=s.peek()+1;
            }
            s.push(i);
        }
        return lb;
    }
    public static int[] nse(int [] arr)
    {
        int rb[]=new int[arr.length];
        Arrays.fill(rb,arr.length);
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!s.isEmpty() && arr[s.peek()]>=arr[i])
            {
                s.pop();
            }
            if(!s.isEmpty())
            {
                rb[i]=s.peek();
            }
            s.push(i);
        }

        return rb;
    }
    public int largestRectangleArea(int[] heights) {
        int lb[]=pse(heights);
        int rb[]=nse(heights);
        int max=0;
        for(int i=0;i<heights.length;i++)
        {
            if(max<=heights[i]*(rb[i]-lb[i]))
            {
                max=heights[i]*(rb[i]-lb[i]);
            }
        }
        
        return max;

    }
}
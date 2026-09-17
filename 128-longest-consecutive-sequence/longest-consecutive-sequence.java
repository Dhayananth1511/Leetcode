class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1) return nums.length;
        Arrays.sort(nums);
        int l=0;
        int max=0;
        for(int r=0;r<nums.length-1;r++)
        {  
            if(nums[r]==nums[r+1]-1)
            {
                l++;
            }
            else if(nums[r]==nums[r+1]) continue;
            else l=0;
            max=Math.max(l,max);
        }
       
        return max+1;
    }
}
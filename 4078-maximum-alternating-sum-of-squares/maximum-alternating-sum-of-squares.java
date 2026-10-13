class Solution {
    public long maxAlternatingSum(int[] nums) {
        long m=0;
        long a[]=new long[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            a[i]=(long)nums[i]*nums[i];
        }
        Arrays.sort(a);

        for(int i=0;i<nums.length;i++)
        {
            if(nums.length/2>i)
            m-=a[i];
            else
            m+=a[i];

        }
        return m;
    }
}
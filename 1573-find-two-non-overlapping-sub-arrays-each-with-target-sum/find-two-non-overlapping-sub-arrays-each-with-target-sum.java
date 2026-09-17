class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int[] b = new int[n];
        Arrays.fill(b, Integer.MAX_VALUE);
        
        int minSum = Integer.MAX_VALUE;
        int curSum = 0;
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            curSum += arr[right];
            
           
            while (curSum > target && left <= right) {
                curSum -= arr[left];
                left++;
            }
            
           
            if (curSum == target) {
                int curLen = right - left + 1;
                
               
                if (left > 0 && b[left - 1] != Integer.MAX_VALUE) {
                    minSum = Math.min(minSum, b[left - 1] + curLen);
                }
                
                
                if (right > 0) {
                    b[right] = Math.min(b[right - 1], curLen);
                } else {
                    b[right] = curLen;
                }
            } else {
                
                if (right > 0) {
                    b[right] = b[right - 1];
                }
            }
        }
        
        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}

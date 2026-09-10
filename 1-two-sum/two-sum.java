// optimized version
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int need = 0;
        for (int i = 0; i < nums.length; i++) {
            need = target - nums[i];
            if (m.containsKey(need)) {
                return new int[] { i, m.get(need) };
            } else {
                m.put(nums[i], i);
            }
        }
        return new int[2];
    }
}

/*   Brute Force
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length-1;i++){
               for (int j=i+1;j<nums.length;j++){
                    if((nums[i]+nums[j])==target){
                            return new int[]{i,j};
                    }
                }   
        }  
        return new int[0];
    }
}
*/
// Time Complexity : O(N*N)
// SC : O(1);

class Solution {

    private void reverse(int[] nums, int n){
        int left = 0, right = n - 1;

        while(left <= right){

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            
            left++;
            right--;
        }
    }
    public int[] decrypt(int[] code, int k) {

        int n = code.length;
        int res[] = new int[n];

        if (k == 0)
            return res;

        boolean negative = false;
        
        if( k < 0){ 
            reverse(code, n);
            k = -k;
            negative = true;
        }

        int sum = 0;
        int indx = 0;

        for (int i = 1; i <= k; i++)
            sum += code[i];

        res[0] = sum;

        for (int i = 1; i < n + k; i++) {
            sum += code[(i + k) % n];
            sum -= code[i % n];

            res[++indx] = sum;

            if (indx == n - 1)
                break;
        }

        if(negative) reverse(res, n);

        return res;
    }
}
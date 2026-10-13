import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> digitList = new ArrayList<>();
        
        for (int num : nums) {
            List<Integer> currentDigits = new ArrayList<>();
            while (num > 0) {
                currentDigits.add(num % 10);
                num /= 10;
            }
            for (int j = currentDigits.size() - 1; j >= 0; j--) {
                digitList.add(currentDigits.get(j));
            }
        }
        
        int[] result = new int[digitList.size()];
        for (int i = 0; i < digitList.size(); i++) {
            result[i] = digitList.get(i);
        }
        
        return result;
    }
}

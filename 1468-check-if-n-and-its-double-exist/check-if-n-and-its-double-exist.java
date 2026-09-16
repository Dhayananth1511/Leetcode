class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Double> set = new HashSet();
        int n = arr.length;

        for(int i = 0; i < n; i++){
            double num = arr[i];

            if(set.contains((double)num * 2) || set.contains((double)num / 2)) return true;

            set.add(num);
        }

        return false;
    }
}
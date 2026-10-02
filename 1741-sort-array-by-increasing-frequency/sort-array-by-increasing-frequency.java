class Solution {
    public int[] frequencySort(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap();
        int n = nums.length;

        for(int i = 0; i < n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List< int[] > list = new ArrayList<>();

        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            list.add(new int[] {m.getKey(), m.getValue()});
        }
        Collections.sort(list, (a, b) -> {

            if(a[1] == b[1]){
                return b[0] - a[0];
            }

            return a[1] - b[1];
        });

        int[] res = new int[n];
        int indx = 0;

        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.get(i)[1]; j++){
                res[indx++] = list.get(i)[0];
            }
        }

        return res;

    }
}
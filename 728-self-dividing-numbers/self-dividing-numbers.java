class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        boolean self = true;
        List<Integer> list = new ArrayList<>();

        for(int i = left; i <= right; i++){
            self = true;
            int n = i;

            while(n != 0){
                int num = n % 10;
                if(num == 0 || i % num != 0){
                    self = false;
                    break;
                }
                n /= 10;
            }
            if(self){
                list.add(i);
            }
        }
        return list;
    }
}
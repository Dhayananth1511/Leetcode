class Solution {
    public int countSeniors(String[] details) {
        int count = 0;

        for(String s : details){

            int c1 = (s.charAt(11) - '0') * 10;
            int c2 = (s.charAt(12) - '0');

            if(c1 + c2 > 60){
                count++;
            }

        }
        return count;
    }
}
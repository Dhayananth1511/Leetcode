class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer> m=new HashMap<>();
        int l=0,odd=0;
        for(String w : words)
        {
            m.put(w,m.getOrDefault(w,0)+1);
        }
        for(String i : m.keySet())
        {
            String r=new StringBuilder(i).reverse().toString();
            if(i.equals(r))
            {
                int c=m.get(i);
                l+=(c/2)*4;

                if(c%2==1) odd=2;
            }
            else if (i.compareTo(r) < 0 && m.containsKey(r)) {
                int pairs = Math.min(m.get(i), m.get(r));
                l += pairs * 4;
         }
        }
        return l+odd;
    }
}
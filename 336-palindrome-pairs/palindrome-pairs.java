class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> l=new ArrayList<>();
        HashMap<String,Integer> m=new HashMap<>();
        for(int i=0;i<words.length;i++)
        {
            m.put(words[i],i);
        }
        for(int i=0;i<words.length;i++)
        {
            String w = words[i];

            for (int j = 0; j <= w.length(); j++) {
                String p = w.substring(0, j);
                String s = w.substring(j);
                String rp = new StringBuilder(p).reverse().toString();
                String rs = new StringBuilder(s).reverse().toString();
                if (rs.equals(s)) {
                    
                    
                    if (m.containsKey(rp) && m.get(rp) != i) {
                        l.add(Arrays.asList(i, m.get(rp)));
                    }
                }
                if (j > 0 && rp.equals(p)) {
                    
                    if (m.containsKey(rs) && m.get(rs) != i) {
                        l.add(Arrays.asList(m.get(rs), i));
                    }
                }
            }
        }
        return l;
    }
}
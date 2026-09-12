class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> m=new HashMap<>();
        for (char c : s.toCharArray()) {
            m.put(c,m.getOrDefault(c,0)+1);
        }
        int length = 0;
        int hasOdd = 0;

        for (int freq : m.values()) {
            // if (freq % 2 == 0) {
            //     length += freq;
            // } else {
            //     length += freq - 1; // use even part
            //     hasOdd = true;
            // }
            length+=(freq/2)*2;
            if(freq % 2 == 1)  hasOdd=1;
        }

        // if (hasOdd) length += 1; // one odd char can go in the center

        return length+hasOdd;
    }
}

// class Solution {
//     public int longestPalindrome(String s) {
//         int[] count = new int[128]; // for all ASCII characters

//         for (char c : s.toCharArray()) {
//             count[c]++;
//         }

//         int length = 0;
//         boolean hasOdd = false;

//         for (int freq : count) {
//             if (freq % 2 == 0) {
//                 length += freq;
//             } else {
//                 length += freq - 1; // use even part
//                 hasOdd = true;
//             }
//         }

//         if (hasOdd) length += 1; // one odd char can go in the center

//         return length;
//     }
// }

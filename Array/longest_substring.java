import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;  

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

           
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);  
            maxLength = Math.max(maxLength, right - left + 1); 
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        String s = "abcabcbb";
        System.out.println(sc.lengthOfLongestSubstring(s));
    }
}
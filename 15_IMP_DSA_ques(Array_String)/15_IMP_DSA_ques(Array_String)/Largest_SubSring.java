class Solution {

    public int longestUniqueSubstr(String s) {

        int n = s.length();
        int left = 0;
        int maxLength = 0;

        int[] freq = new int[26];  // lowercase letters only

        for (int right = 0; right < n; right++) {

            char ch = s.charAt(right);
            freq[ch - 'a']++;

            // If duplicate found
            while (freq[ch - 'a'] > 1) {
                freq[s.charAt(left) - 'a']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        Solution sc = new Solution();
        int result = sc.longestUniqueSubstr(s);
        System.out.println(result);
    }
}

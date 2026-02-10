class Solution {
    public static boolean areAnagrams(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }
        int[] count = new int[26]; 
        // Count characters of s1
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
        }
        // Subtract characters of s2
        for (int i = 0; i < s2.length(); i++) {
            count[s2.charAt(i) - 'a']--;
        }
        // Check mismatch
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;

    }
    public static void main(String[]args){
        String s1="geeks";
        String s2="keeg";
        System.out.println(areAnagrams(s1,s2));
    }
}
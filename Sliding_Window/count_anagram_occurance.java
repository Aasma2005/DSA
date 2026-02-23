// User function Template for Java
import java.util.*;
class Solution {

    int search(String pat, String txt) {
        
        int n = txt.length();
        int k = pat.length();
        
        if (k > n) return 0; 

        int[] patCount = new int[26];
        int[] windowCount = new int[26];
        int count = 0;

        
        for (int i = 0; i < k; i++) {
            patCount[pat.charAt(i) - 'a']++;
            windowCount[txt.charAt(i) - 'a']++;
        }

        if (Arrays.equals(patCount, windowCount)) {
            count++;
        }

        
        for (int i = k; i < n; i++) {
            windowCount[txt.charAt(i) - 'a']++;
            
           
            windowCount[txt.charAt(i - k) - 'a']--;

            if (Arrays.equals(patCount, windowCount)) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[]args){
        String txt="forxxorfxdofr";
        String pat="for";
        Solution sc=new Solution();
        System.out.println(sc.search(pat, txt));
    }
}
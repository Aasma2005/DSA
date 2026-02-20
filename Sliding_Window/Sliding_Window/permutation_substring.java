// Given two strings txt and pat having lowercase letters, the task is to check if 
// any permutation of pat is a substring of txt.
// Examples:

// Input: txt = "geeks", pat = "eke"
// Output: true
// Explanation: "eek" is a permutation of "eke" which exists in "geeks".
// Input: txt = "programming", pat = "rain"
// Output: false
// Explanation: No permutation of "rain" exists as a substring in "programming".

public class permutation_substring {
    public static void main(String[] args) {
        String txt="programming";
        String pat="rain";

        permutation_substring sc=new permutation_substring();
        System.out.println(sc.permutaton_array(txt,pat));
    }

    private boolean permutaton_array(String txt, String pat) {
        int n = txt.length();
        int k = pat.length();
        
        if (k > n) return false;
        
        int[] patFreq = new int[26];
        int[] windowFreq = new int[26];
        
        // Step 1: Store frequency of pat
        for (int i = 0; i < k; i++) {
            patFreq[pat.charAt(i) - 'a']++;
            windowFreq[txt.charAt(i) - 'a']++;
        }
        
        // Step 2: Slide the window
        for (int i = k; i < n; i++) {
            
            if (isEqual(patFreq, windowFreq))
                return true;
            
            // Add new character
            windowFreq[txt.charAt(i) - 'a']++;
            
            // Remove old character
            windowFreq[txt.charAt(i - k) - 'a']--;
        }
        
        // Check last window
        return isEqual(patFreq, windowFreq);
    }
    
    static boolean isEqual(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }
}


  


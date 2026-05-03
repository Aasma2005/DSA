public class DeleteChar {
    // User function Template for Java
   
    public boolean decode(String S) {
        
        int j = 0; // Pointer for "hello"

        for (int i = 0; i < S.length(); i++) {
            // Check current char (ignoring case)
            char c = Character.toLowerCase(S.charAt(i));
            
            if (c == S.charAt(j)) {
                j++; // Move to the next letter in "hello"
            }
            
            // If we found all 5 letters, stop and return true
            if (j == 5) return true;
        }

        return false; // Finished the string without finding "hello"
}
    public static void main(String[]args){
        String S = "hello";
      
        DeleteChar sc=new DeleteChar();
        System.out.println(sc.decode(S));
        
    }
}


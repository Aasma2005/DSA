// User function Template for Java
class Search_Char {
    // Function to search for a character in the string
    public int searchCharacter(String s, char ch) {
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                return i;
            }
        }
        return -1;
        
        
        
    }
     public static void main(String[] args) {
        String s="geeksforgeeks";
        char ch='k';
        Search_Char sc=new Search_Char();
        int result=sc.searchCharacter(s, ch);
        System.out.println(result);
     }
}
// Input :  s = "abc"
// Output :  "a", "ab", "abc", "b", "bc", "c"



public class print_substring {
    public static void main(String[] args) {
        
        String s="abc";
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                System.out.println(s.substring(i, j+1));
                
            }
            
        }
    }
    
}

public class Remove_all_occurance {
    
    public void removeCharacter(StringBuilder s, char c) {
        // code here
        for (int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i) == c) {
                s.deleteCharAt(i);
                i--; 
            }
        }
    }
    public static void main(String[]args){
        StringBuilder s=new StringBuilder("greeksforgreeks");
        char c='e';
        Remove_all_occurance sc = new Remove_all_occurance();
        sc.removeCharacter(s, c);
        System.out.println(s);
    }
}
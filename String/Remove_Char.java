public class Remove_Char {
    

    public String removeCharacter(String s, int pos) {
      
       if (pos < 0 || pos >= s.length()) {
            return s;
        }
        return s.substring(0, pos) + s.substring(pos + 1);
    }
    public static void main(String[]args){
        String s="abcde";
        int pos=1;
        Remove_Char sc=new Remove_Char();
        String result=sc.removeCharacter(s,pos);
        System.out.println(result);
    }
}
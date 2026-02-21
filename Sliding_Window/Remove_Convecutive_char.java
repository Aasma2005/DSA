public class Remove_Convecutive_char {
    public static void main(String[] args) {
        
        String s="aabbcfdee";
        if (s == null || s.length() == 0){
            System.out.println("");
        } 

        StringBuilder sb=new StringBuilder();

        sb.append(s.charAt(0)); //1st character is always unique

        for(int i=1;i<s.length();i++){
            if(s.charAt(i) != s.charAt(i-1)){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
    
}

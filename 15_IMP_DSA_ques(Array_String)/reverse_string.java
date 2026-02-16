public class reverse_string {

    public static void main(String[] args) {
        String str= "hello";
        String r="";

    for(int i=0;i<str.length();i++){
         r=str.charAt(i)+r; 
    }
    System.out.println(r);
    }
    
}

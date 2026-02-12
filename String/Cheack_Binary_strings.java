 class Cheack_Binary_strings{

    boolean isBinary(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != '0' && s.charAt(i) != '1'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="101";
        Cheack_Binary_strings sc=new Cheack_Binary_strings();
        System.out.println(sc.isBinary(s));
    }
 }
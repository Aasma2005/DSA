public interface ReverseStringUsingLoop {

    public static String reverseString(String s){
        String r="";
        for(int i=0;i<s.length();i++){
            r=s.charAt(i)+r;

        }
        return r;
    }

    public static void main(String[] args) {
        String s="AasmaA";

        System.out.println(ReverseStringUsingLoop.reverseString(s));
    }
}

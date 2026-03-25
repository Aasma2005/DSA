class ReverseStringUsingBuilder{

    public static String reverseString(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="Aasma";
        ReverseStringUsingBuilder rs=new ReverseStringUsingBuilder();
        System.out.println(rs.reverseString(s));
    }
}
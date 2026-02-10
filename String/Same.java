
class StringUtils {
    public static boolean areStringsSame(String s1, String s2) {
        // code here
        if(s1.equals(s2)){
        return true;
    }
    return false;
    }
    public static void main(String[]args){
        String s1="abc";
        String s2="abc";
        System.out.println(areStringsSame(s1, s2));
    }
}
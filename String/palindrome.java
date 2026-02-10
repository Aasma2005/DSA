class Solution {
    boolean isPalindrome(String s) {
        // code here
        String rev="";
        for(int i= s.length(); i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if(s.toLowerCase().equals(rev.toLowerCase())){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[]args){
        String s="abba";
        Solution sc=new Solution();
        boolean result=sc.isPalindrome(s);
        System.out.println(result);
    }
}
class LargeOddNumInString{
    public String LargeNum(String s){
        
        // for(int i=s.length()-1;i>=0;i--){
        //     char ch=s.charAt(i);
        //     if((ch-'0')%2 != 0){
        //         return s.substring(0, i+1);

        //     }
        // }
        // return "";
        int end = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if ((s.charAt(i) - '0') % 2 != 0) {
                end = i;
                break;
            }
        }
        if (end == -1) return "";

        String result = s.substring(0, end + 1);

        int start = 0;
        while (start < result.length() && result.charAt(start) == '0') {
            start++;
        }

       
        return result.substring(start);
    }
    public static void main(String[] args) {
        String s="0214638";
        LargeOddNumInString obj=new LargeOddNumInString();
        System.out.println(obj.LargeNum(s));
    }
}
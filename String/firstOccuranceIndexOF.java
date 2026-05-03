public class firstOccuranceIndexOF {
    public static void main(String[] args) {
        String txt="GreekForGreek";
        String pat="For";
        int ind=txt.indexOf(pat);
        if(ind!=-1){
            System.out.println(ind);
        }
        else{
            System.out.println(-1);
        }
    }
}

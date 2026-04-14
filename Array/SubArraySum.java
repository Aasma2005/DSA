public class SubArraySum {
    public static void main(String[]args){
        int arr[]=new int[]{1,2,3};
        SubArraySum sa=new SubArraySum();
        System.out.println(sa.subarraySum(arr));
        
    }

    private int subarraySum(int[] arr) {
        int result=0;
        int temp=0;
        for(int i=0;i<arr.length;i++){
            temp=0;
            for(int j=i;j<arr.length;j++){
                temp+=arr[j];
                result+=temp;
                
            }
        }
        return result;
    }
}

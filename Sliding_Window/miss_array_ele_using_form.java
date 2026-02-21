public class miss_array_ele_using_form {
    public static void main(String[] args) {
        
        int arr[]=new int[]{1,2,3,5};
        int n=arr.length+1;

        long totalsumofArray=n*(n+1)/2;
        int arraySum=0;

        for(int i=0;i<arr.length;i++){
            arraySum+=arr[i];
        }
        System.out.println(totalsumofArray-arraySum);
    }
    
}

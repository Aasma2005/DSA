public class RotateClockWiseArray {

    public void rotateArray(int[] arr, int k){
        int n=arr.length;
        k=k%n;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            if(i<k){
                res[i]=arr[n+i-k];
            }
            else{
                res[i]=arr[i-k];
            }
        }
            for(int i=0;i<n;i++){
                arr[i]=res[i];
            }
        }
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6};
        int k=2;
        RotateClockWiseArray obj=new RotateClockWiseArray();
        obj.rotateArray(arr,k);
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}

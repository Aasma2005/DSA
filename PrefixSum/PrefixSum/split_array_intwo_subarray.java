public class split_array_intwo_subarray {


    public boolean canSplit(int[] arr, int n){

        int totalsum=0;

        for(int num: arr){
            totalsum+=num;
        }
         int leftsum=0;
         for(int i=0;i<n;i++){
            leftsum+=arr[i];

             //optimize approach insted of calculating right sum in every iteration
              int rightsum=totalsum-leftsum;
         
        //  for(int j=i+1;j<n;j++){
        //     rightsum+=arr[j];

            if(leftsum==rightsum){
                return true;
            }

        //  }
        }
        return false;
    }
    

public static void main(String[]args){
    int arr[]=new int[]{1,2,3,4,5,5};
    int n=arr.length;
    split_array_intwo_subarray sa=new split_array_intwo_subarray();
    System.out.println(sa.canSplit(arr, n));
    
}
}
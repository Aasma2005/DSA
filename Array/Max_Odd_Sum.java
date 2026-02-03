public class Max_Odd_Sum {
    public int maxSum(int arr[], int sum){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                sum+=arr[i];
            }
        }
        return sum;

    }
    public static void main(String[]args){
        int arr[]=new int[]{4,-3,-3,5};
        int sum=0;
        Max_Odd_Sum mx=new Max_Odd_Sum();
        int result=mx.maxSum(arr, sum);
        System.out.println(result);
    }
    
}

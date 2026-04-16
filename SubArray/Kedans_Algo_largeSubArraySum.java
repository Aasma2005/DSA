class Kedans_Algo_LargeSubArraySum{
    int maxSum(int[] arr){
        int res=arr[0];
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                res=Math.max(sum, res);
            }
        }
    
    return res;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{2,3,-8,7,-1,2,3};
        Kedans_Algo_LargeSubArraySum  obj=new Kedans_Algo_LargeSubArraySum();
        System.out.println(obj.maxSum(arr));
    }
}
class Memo{

    public int[] TwoSum(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
        }
    public static void main(String[]args){
        Memo dt=new Memo(); 
        int arr[]=new int[]{2,7,11,15};
        int target=9;
        int result[]=dt.TwoSum(arr,target);
        System.out.println(result);
        }
}
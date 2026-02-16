public class TwoSum {
    
    public int[] TwoSum(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+ " "+ j);
                }
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        TwoSum ts=new TwoSum();
        int[] arr=new int[]{2,7,1,15};
        int target=9;
        int result[]=ts.TwoSum(arr, target);
        System.out.println(result);
    }
    
}

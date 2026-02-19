public class count_Increasing_array {
    public int countArray(int[] arr){

        int len=1;
        int count=0;
        for(int i=1;i<arr.length;i++)  {
            if(arr[i]>arr[i-1]){
                len++;
            }
            else{
                count+=(len*(len-1))/2;
                len=1;
            }
        }
         count+=(len*(len-1))/2;
        return count;
          }
          public static void main(String[] args) {
            int arr[]=new int[]{1,3,3,2,3,5};
            count_Increasing_array sc=new count_Increasing_array();
            System.out.println(sc.countArray(arr));
          }
    
}

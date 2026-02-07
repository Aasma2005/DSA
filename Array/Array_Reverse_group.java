public class Array_Reverse_group {

    static void reverse(int arr[] ,int k){
        int n=arr.length;
        for(int i=0;i<arr.length;i+=k){
            int left=i;
            int right=Math.min(i+k-1,n-1);

            while(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
    }    
    public static void main(String[]args){
        int arr[]=new int[]{1,2,3,4,5,6,7,8};
        int k=3;

        reverse(arr,k);
        for(int num:arr){
            System.out.print(num+"  ");
        }
    }
}

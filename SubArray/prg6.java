/*give an array of size N, 
 * int arr=new int[]{2,4,3,1};
 * calculate the sum of every single subarray with time complexity o(n)
 * without using extra space complexity
 */

public class prg6 {
    public static void main(String[]args){

        
        int arr[]=new int[]{2,4,1,3};
        int prefixsum[]=new int[arr.length];
        prefixsum[0]=arr[0];

        for(int i=1;i<arr.length;i++){
            prefixsum[i]=prefixsum[i-1]+arr[i];

        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                if(i==0)
                    sum=prefixsum[j];
                    else
                    sum=prefixsum[j]-prefixsum[i-1];
                    System.out.println(sum);
                }
            }
        }
    }
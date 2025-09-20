/*maximum subarray sum
give an integer array of size N
find the contiguous subarray (containing at least once on number) 
which has the largest sum and return its sum
 * Arr=[-2,1,-3,4,-1,2,1,-5,4]
 * output=6
 * explanation :[4,-1,2,1] largest sum =6
 * A].Maximumsum of :prefix sum approach
 */


public class prg11 {
    public static void main(String[]args){

        int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int prefixsum[]=new int[arr.length];

        prefixsum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefixsum[i]=prefixsum[i-1]+arr[i];
        }
        int maxsum=Integer.MIN_VALUE;

            for(int i=0;i<arr.length;i++){

                for(int j=i;j<arr.length;j++){
                     int sum;
                    if(i==0){
                        sum=prefixsum[j];
                    }
                        else{
                        sum=prefixsum[j]-prefixsum[i-1];
                        }
                        if(sum>maxsum){
                            maxsum=sum;
                        }
                        System.out.println("subarray("+i+"to"+j+")sum="+sum+"=>max"+maxsum);
                }
            }
            System.out.println("maximum sum of subarray:"+maxsum);
        }
    }
    


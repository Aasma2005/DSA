/*maximum subarray sum
give an integer array of size N
find the contiguous subarray (containing at least once on number) 
which has the largest sum and return its sum
 * Arr=[-2,1,-3,4,-1,2,1,-5,4]
 * output=6
 * explanation :[4,-1,2,1] largest sum =6
 * A].Maximumsum of :brust force approach
 */

public class prg9 {
    public static void main(String[] args) {

        int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){

                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                }
                
                if(sum>maxsum){
                    maxsum=sum; 
                }   
                System.out.println("Subarray ("+i+" to "+j+") sum = "+sum+" => Max = "+maxsum);
            }       
            }
        System.out.println("\nMaximum Subarray Sum = " + maxsum);
    }  
    }
    


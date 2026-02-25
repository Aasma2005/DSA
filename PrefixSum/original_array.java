// input:  presum[] = {5, 7, 10, 11, 18}
    // Output: [5, 2, 3, 1, 7]
    // Explanation: Original array {5, 2, 3, 1, 7} 
    // Prefix sum array = {5, 5+2, 5+2+3, 5+2+3+1, 5+2+3+1+7} = {5, 7, 10, 11, 18}
    // Each element of original array is replaced by the sum of the prefix of current index.

    // Input: presum[] = {45, 57, 63, 78, 89, 97}
    // Output: [45, 12, 6, 15, 11, 8] 

public class original_array {
    public static void main(String[] args) {

            int[] arr={5,7,10,11,18};
            int n=arr.length;
            int original[]=new int[n];
            
            for(int i=0;i<n;i++){
                if(i==0){
                    original[0]=arr[0];
                }
                else{
                    original[i]=arr[i]-arr[i-1];
                }
            }
            
            for(int num:original){
                System.out.print(num+" ");
            }
        }
    }


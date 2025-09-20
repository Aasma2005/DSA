/*array of size N
find the total number of subarray 
int arr[]=new []{1,2,3};
output=20;
 */

public class prg8 {
    public static void main(String[]args){
        int arr[]=new int[]{1,2,3};
        int N=3;
        int totalsum=0;
        
        for(int i=0;i<N;i++){
            int sum=0;
            for(int j=i;j<N;j++){
    
                sum += arr[j];       
                totalsum += sum;
            }
        }
        System.out.println(totalsum);
    }
    
}

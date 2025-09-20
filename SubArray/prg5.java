
/*give an array of size N, 
 * int arr=new int[]{2,4,3,1};
 * A:print the sum of single subarray
 * brust force approach
 */

public class prg5 {

    public static void main(String[]args){

        int arr[]=new int[]{2,4,1,3};

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){

                    sum=sum+arr[k];
                    
                }
                System.out.println("sum"+":"+sum);
                
            }

        }
    }

    
}

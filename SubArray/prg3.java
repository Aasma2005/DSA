/* give an array of size N
  Print all the element in an given subArray from start to end
  int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
  Start=3
  end=7
 */

 public class prg3 {
    public static void main(String[]args){

        int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int start=3;
        int end=7;

        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }



    
}

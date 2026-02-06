import java.util.Arrays;

public class Reverse_array {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4};
       
         int i=0;
         int j=arr.length-1;
         while(i<j){
        
               int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;

            }
            
            System.out.println(Arrays.toString(arr));
        }
    }
   

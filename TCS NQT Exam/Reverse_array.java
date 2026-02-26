import java.util.Arrays;

public class Reverse_array {
public void reverseArray(int[] arr){

    int i=0;
    int j=arr.length-1;
   
    while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }
   
}
public static void main(String[]args){
    int[] arr=new int[]{1,2,3,4,5,6};
    Reverse_array sc=new Reverse_array();
   sc.reverseArray(arr);
        System.out.println(Arrays.toString(arr));
}
}

import java.util.*;

public class third_max {

    public static int thirdEle(int arr[]){
        Arrays.sort(arr);
        int n=arr.length;

        return arr[n-3];

    }
    public static void main(String[] args) {
        int arr[]=new int[]{11,23,45,65,43,78,90};
        System.out.println(thirdEle(arr));
         
    }
    
}

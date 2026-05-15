import java.util.Arrays;

public class SortArray {

    public void ArraySort(int[] arr){
        Arrays.sort(arr);
    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,4,3,5};
        SortArray sc=new SortArray();
        sc.ArraySort(arr);
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}

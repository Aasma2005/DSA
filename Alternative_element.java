import java.util.ArrayList;


public class Alternative_element {
    ArrayList<Integer> AlternateArray(int[] arr){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i+=2){
            list.add(arr[i]);
        }
        return list;
    }
    public static void main(String[]args){
        int arr[]=new int[]{1,2,3,4,5};
        Alternative_element sc=new Alternative_element();
        ArrayList<Integer> result=sc.AlternateArray(arr);
        System.out.println(result);
    }
}

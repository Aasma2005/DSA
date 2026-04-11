import java.util.*;
public class Array_rightLeaders {
    ArrayList<Integer> leaders(int arr[]){

    
    ArrayList<Integer> list=new ArrayList<>();

    int n=arr.length;
    int rightmax=arr[n-1];
    list.add(rightmax);
    for(int i=n-1;i>=0;i--){
        if(arr[i]>=rightmax){
            rightmax=arr[i];
            list.add(rightmax);
        }
    }
    Collections.reverse(list);
    return list;
    }

public static void main(String[] args) {
    int arr[]=new int[]{16,17,4,3,5,2};
    Array_rightLeaders sc=new Array_rightLeaders();
    ArrayList<Integer> result=sc.leaders(arr);
    System.out.println(result);
}
    
}

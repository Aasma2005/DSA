
import java.util.*;
class Leader_array {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> list=new ArrayList<>();
        
        int maxRight=arr[arr.length-1];
        list.add(maxRight);
        
        for (int i = arr.length - 2; i >= 0; i--) {
            if(arr[i]>=maxRight){
                maxRight=arr[i];
                list.add(arr[i]);
            }
        } 
        Collections.reverse(list);
        return list;
        
    }
    public static void main(String[]args){
        int arr[]=new int[]{16,17,4,3,5,2};
         Leader_array obj=new Leader_array();
        ArrayList<Integer> result=obj.leaders(arr);
        System.out.println(result);
    }
}

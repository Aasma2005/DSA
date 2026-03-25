import java.util.ArrayList;

public class Smallestand2ndSmallEleArray {


 private ArrayList<Integer> FindMin2ndMin(int[] arr) {
    
    int n=arr.length;
    ArrayList<Integer> res=new ArrayList<>();

    int min=Integer.MAX_VALUE;
    int secondMin=Integer.MAX_VALUE;

    for(int i=0;i<n;i++){
        if(arr[i]<min){
            secondMin=min;
            min=arr[i];
        }
        else if(arr[i]<secondMin && arr[i]!=min){
            secondMin=arr[i];
        }
    }
    if(secondMin==Integer.MAX_VALUE){
        res.add(-1);
    }
    else{
        res.add(min);
        res.add(secondMin);
    }
    return res;
    
    
 }   
  public static void main(String[] args) {
    int arr[]=new int[]{1,2,3,4,5,6};
    Smallestand2ndSmallEleArray sc=new Smallestand2ndSmallEleArray();
    System.out.println(sc.FindMin2ndMin(arr));
 }
}

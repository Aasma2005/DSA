import java.util.ArrayList;

public class prefixSum_using_arraylist {

    public ArrayList<Integer> prefSum(int[] arr){
        ArrayList<Integer> prefSum=new ArrayList<>();

        prefSum.add(arr[0]);

        for(int i=1;i<arr.length;i++){
            prefSum.add(prefSum.get(i-1)+arr[i]);
        }
        return prefSum;
    }

    public static void main(String[]args){

        int arr[]=new int[]{10,20,10,5,15};

        prefixSum_using_arraylist pf=new prefixSum_using_arraylist();
        ArrayList<Integer> prefSum=pf.prefSum(arr);
        for (int i : prefSum) {
            System.out.print(i + " ");
        }


    }
    
}


import java.util.*;
class three_largest {
    public int[] getThreeLargest(int arr[]) {
        // code here
        
       Set<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());

        int size = Math.min(3, list.size());
        int result[] = new int[size];

        for(int i = 0; i < size; i++){
            result[i] = list.get(i);
        }

        return result;
    }
    public static void main(String[]args){
        int arr[]=new int[]{10,4,3,50,23,90,90};
        three_largest  sc=new three_largest ();
        System.out.println(sc.getThreeLargest(arr));
    }
}
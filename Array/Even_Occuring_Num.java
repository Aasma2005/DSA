import java.util.HashSet;

public class Even_Occuring_Num {
    public static void main(String[] args) {
        int arr[] = {9,12,23,10,12,12,15,23,14,12,15};
        HashSet<Integer> printed = new HashSet<>();
        
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count % 2 == 0 && !printed.contains(arr[i])){
                System.out.println(arr[i]);
                printed.add(arr[i]);
            }
        }
    }
}

// Input: arr[] = [1, 2, 3, 4, 5], d = 2
// Output: [3, 4, 5, 1, 2]
// Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.

public class Rotate_array {
    public void rotateArray(int arr[], int d){
        int n=arr.length;
        for(int i=0;i<d;i++){
            int first=arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=first;

        }
    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5};
        int d=2;
        Rotate_array ra=new Rotate_array();
        ra.rotateArray(arr, d);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    
}

// Input: arr[] = [1, 2, 0, 3]
// Output: 2 
// Explanation: The sum of left of index 2 is 1 + 2 = 3 and sum on right of index 2 is 3.

public class Equilibrium {
    public static int equilibriumPoint(int arr[]){
        int totalSum = 0;
        int leftSum = 0;

        for (int num : arr) {
            totalSum += num;
        }

        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];

            if (leftSum == totalSum) {
                return i; 
            }

            leftSum += arr[i];
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,0,3};
        Equilibrium eq=new Equilibrium();
        System.out.println(eq.equilibriumPoint(arr));
    }
}

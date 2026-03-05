// Input: arr[] = [1, 2, 0, 3]
// Output: 2 
// Explanation: The sum of left of index 2 is 1 + 2 = 3 and sum on right of index 2 is 3.

public class Equilibrium {
    public static int equilibriumPoint(int arr[]){
        int totalSum = 0;
        int leftSum = 0;

        // Step 1: Purna array chi total sum kadha
        for (int num : arr) {
            totalSum += num;
        }

        // Step 2: Array madhun loop firva
        for (int i = 0; i < arr.length; i++) {
            // totalSum madhun current element minus kela ki Right Sum milte
            totalSum -= arr[i];

            // Step 3: Check kara Left Sum ani Right Sum sarkhi aahe ka
            if (leftSum == totalSum) {
                return i; // Equilibrium point sapadla! (Index return kara)
            }

            // Pudhchya step sathi current element Left Sum madhe add kara
            leftSum += arr[i];
        }

        // Jar kahi sapadla nahi tar -1
        return -1;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,0,3};
        Equilibrium eq=new Equilibrium();
        System.out.println(eq.equilibriumPoint(arr));
    }
}

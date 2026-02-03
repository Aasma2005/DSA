public class Lagest_Num_from_Digits {
    public static void main(String[] args) {

        int arr[] = {9, 0, 1, 3, 0};

        // Step 1: frequency array
        int[] count = new int[10];

        // Step 2: count digits
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Step 3: build largest number
        StringBuilder result = new StringBuilder();

        for (int digit = 9; digit >= 0; digit--) {
            while (count[digit] > 0) {
                result.append(digit);
                count[digit]--;
            }
        }

        System.out.println(result.toString()); // 93100
    }
}

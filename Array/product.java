class Solution {
    public static int[] product(int arr[]) {

        int n = arr.length;
        int res[] = new int[n];

        int totalProduct = 1;

        // Step 1: calculate total product
        for (int i = 0; i < n; i++) {
            totalProduct *= arr[i];
        }

        // Step 2: product except self
        for (int i = 0; i < n; i++) {
            res[i] = totalProduct / arr[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = {10, 3, 5, 6, 2};
        int result[] = product(arr);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}

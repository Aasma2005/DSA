import java.util.*;

class mean_range_array {
    
    // Function to compute floor of mean for each query
    public static int[] findMean(int[] arr, int[][] queries) {
        
        int n = arr.length;
        int q = queries.length;
        int[] result = new int[q];

        // Iterate through each query
        for (int i = 0; i < q; i++) {
            
            // Convert to 0-based index
            int l = queries[i][0] - 1;
            
            // Convert to 0-based index
            int r = queries[i][1] - 1; 
            
            int sum = 0, count = 0;

            // Calculate sum of elements in 
            // range l to r
            for (int j = l; j <= r; j++) {
                sum += arr[j];
                count++;
            }

            // Store floor of mean in result
            result[i] = sum / count;
        }

        return result;
    }

    // Function to print the result
    public static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        
        int[] arr = {3, 7, 2, 8, 5};
        int[][] queries = { {1, 3}, {2, 5} };
        
        int[] result = findMean(arr, queries);
        printArr(result);
    }
}
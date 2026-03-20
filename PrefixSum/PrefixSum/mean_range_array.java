

import java.util.*;

class mean_range_array {
    
    public static int[] findMean(int[] arr, int[][] queries) {
        
        int n = arr.length;
        int q = queries.length;
        int[] result = new int[q];

        for (int i = 0; i < q; i++) {
            
            int l = queries[i][0] - 1;
            int r = queries[i][1] - 1;   
            int sum = 0, count = 0;

            for (int j = l; j <= r; j++) {
                sum += arr[j];
                count++;
            }

            result[i] = sum / count;
        }

        return result;
    }
    public static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int[] arr = {3, 7, 2, 8, 5};
        int[][] queries = { {1, 3}, {2, 5} };
        
        int[] result = findMean(arr, queries);
        printArr(result);
    }
}
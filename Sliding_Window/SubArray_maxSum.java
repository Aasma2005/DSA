class Solution {
    
    public int maxSubarraySum(int[] arr, int k) {
        
        int n = arr.length;
        
        // Step 1: Calculate first window sum
        int windowSum = 0;
        for(int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        
        int maxSum = windowSum;
        
        // Step 2: Slide the window
        for(int i = k; i < n; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        
        return maxSum;
    }

    public static void main(String[] args){
        int arr[] = {100,200,300,400};
        int k = 2;
        Solution sc = new Solution();
        int result = sc.maxSubarraySum(arr,k);
        System.out.println(result);
    }
}
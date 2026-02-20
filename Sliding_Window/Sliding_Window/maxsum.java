
// User function Template for Java

class Solution {
    public long findMaxSubarraySum(int[] arr, long x) {
        
     

    if (x > arr.length) return -1;

    long current = 0;

    // First window
    for (int i = 0; i < x; i++) {
        current += arr[i];
    }

    long maxSum = current;

    // Sliding window
    for (int i = 1; i <= arr.length - x; i++) {

        current = current - arr[i - 1] + arr[(int) (i + x - 1)];

        if (current > maxSum) {
            maxSum = current;
        }
    }

    return maxSum;

    }
    public static void main(String[]args){
        int arr[]=new int[]{1,2,3,4,5};
        long x=11;
        Solution sc=new Solution();
        System.out.println(sc.findMaxSubarraySum(arr, x));
    }
}

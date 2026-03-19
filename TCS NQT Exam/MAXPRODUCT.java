public class MAXPRODUCT {
    public int maxProduct(int[] arr) {
        
        int n = arr.length;
        double maxProd = arr[0];
        double leftPrefix = 1;
        double rightPrefix = 1;

        for (int i = 0; i < n; i++) {
            // 1. Reset if we hit a zero (zero breaks the product chain)
            if (leftPrefix == 0) leftPrefix = 1;
            if (rightPrefix == 0) rightPrefix = 1;

            // 2. Multiply from left to right
            leftPrefix *= arr[i];
            
            // 3. Multiply from right to left (using index n-1-i)
            rightPrefix *= arr[n - 1 - i];

            // 4. Update the global maximum
            maxProd = Math.max(maxProd, Math.max(leftPrefix, rightPrefix));
        }
        
        return (int)maxProd;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{-1, 6, -3, -10, 0, 2};
        MAXPRODUCT obj = new MAXPRODUCT();
        System.out.println(obj.maxProduct(arr)); // Output: 180
    }
}


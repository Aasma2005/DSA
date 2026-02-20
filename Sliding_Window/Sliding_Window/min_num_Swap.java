public class min_num_Swap {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 12, 10, 14, 13, 3, 15};
        int k = 3;
        
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] <= k) {
                count++;
            }
        }
        
        int placeCount = 0;
        for(int i = 0; i < count; i++) {
            if(arr[i] > k) {
                placeCount++;
            }
        }
        
        int minSwap = placeCount;

        for(int i = 0, j = count; j < arr.length; i++, j++) {
            
            // Purana element window se bahar gaya (i)
            if(arr[i] > k) {
                placeCount--;
            }
            
            // Naya element window mein aaya (j)
            if(arr[j] > k) {
                placeCount++;
            }
            
            minSwap = Math.min(minSwap, placeCount);
        }
        
        System.out.println("Minimum Swaps Required: " + minSwap);
    }
}
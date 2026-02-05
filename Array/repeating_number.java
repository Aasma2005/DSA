//Time complexity=o(n)
//auxilary space=o(k)

public class repeating_number {

    public static void main(String[] args) {

        int arr[] = {2, 2, 3, 2};
        int n = arr.length;
        int k = 4;   // because elements are in range 0 to k-1

        int[] freq = new int[k];

        // Count frequency
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        int maxFreq = -1;
        int ans = 0;

        // Find max repeating number
        for (int i = 0; i < k; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                ans = i;
            }
        }

        System.out.println(ans);
    }
}


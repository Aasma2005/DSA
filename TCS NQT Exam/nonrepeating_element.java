public class nonrepeating_element {
    public int firstNonRepeating(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        int min = arr[0];
        int max = arr[0];
        
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        
        int[] freq = new int[max - min + 1];

        for (int num : arr) {
            freq[num - min]++; 
        }

        for (int num : arr) {
            if (freq[num - min] == 1) {
                return num;
            }
        }

        return 0;
    }
}

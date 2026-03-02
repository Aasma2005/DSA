public class ternary_search {
    public static int findMinIndex(int[] arr) {
        int low = 0, high = arr.length - 1;
        int minIndex = -1;

        while (low <= high) {

            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;

            // if both mid1 and mid2 point to equal 
            // values narrow the search
            if (arr[mid1] == arr[mid2]) {

                // Move towards the center
                low = mid1 + 1;
                high = mid2 - 1;

                // tentatively store mid1 as
                // potential minimum
                minIndex = mid1;
            }

            // if arr[mid1] < arr[mid2], the minimum lies in the
            // left part (including mid1)
            else if (arr[mid1] < arr[mid2]) {
                high = mid2 - 1;

                // update with better candidate
                minIndex = mid1;
            }

            // is arr[mid1] > arr[mid2], the minimum lies in the
            // right part (including mid2)
            else {
                low = mid1 + 1;

                // update with better candidate
                minIndex = mid2;
            }
        }

        return minIndex;
    }

    public static void main(String[] args) {
        int[] arr = {9, 7, 1, 2, 3, 6, 10};
        int idx = findMinIndex(arr);
        System.out.println(idx);
    }
}

import java.util.Arrays;

public class BinaryDataType {


    public static void main(String[] args) {
        // Declaring and initializing byte arrays
        // to search over them
        byte arr1[] = { 10, 20, 30, 40 };
        char arr2[] = { 'g', 'p', 'q', 'c', 'i' };
        int arr3[] = { 10, 20, 15, 22, 35 };
        double arr4[] = { 10.2, 15.1, 2.2, 3.5 };
        float arr5[] = { 10.2f, 15.1f, 2.2f, 3.5f };
        short arr6[] = { 10, 20, 15, 22, 35 };

        // Using sort() method of Arrays class
        // and passing arrays to be sorted as in arguments
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        Arrays.sort(arr4);
        Arrays.sort(arr5);
        Arrays.sort(arr6);

        // Primitive datatypes
        byte key1 = 35;
        char key2 = 'g';
        int key3 = 22;
        double key4 = 1.5;
        float key5 = 35;
        short key6 = 5;

        // Now in sorted array we will fetch and
        // return elements indexes to show
        // array is really sorted

        System.out.println(
            key1 + " found at index: "
            + Arrays.binarySearch(arr1, key1));
        System.out.println(
            key2 + " found at index: "
            + Arrays.binarySearch(arr2, key2));
        System.out.println(
            key3 + " found at index: "
            + Arrays.binarySearch(arr3, key3));
        System.out.println(
            key4 + " found at index: "
            + Arrays.binarySearch(arr4, key4));
        System.out.println(
            key5 + " found at index: "
            + Arrays.binarySearch(arr5, key5));
        System.out.println(
            key6 + " found at index: "
            + Arrays.binarySearch(arr6, key6));
    }
}


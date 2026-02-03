public class Element_in_Range {
    public static void main(String[] args) {

        int arr[] = {1,4,5,2,7,8,3};
        int A = 2;
        int B = 6
        ;

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= A && arr[i] <= B) {
                count++;
            }
        }

        if (count == (B - A + 1))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

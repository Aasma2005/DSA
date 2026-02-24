public class splitarray_two_part {
    
    public void canSplit(int arr[]) {
        int totalSum = 0;
        for (int x : arr) {
            totalSum += x;
        }

        int leftSum = 0;
        int splitIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i]; 
        
            int rightSum = totalSum - leftSum;

            if (leftSum == rightSum) {
                splitIndex = i; 
                break;
            }
        }

        if (splitIndex != -1) {
            System.out.print("{ ");

            for (int i = 0; i <= splitIndex; i++) {
                System.out.print(arr[i]+",");
            }

            System.out.println(" }");
            System.out.print("{ ");
            
            for (int i = splitIndex + 1; i < arr.length; i++) {
                System.out.print(arr[i]+",");
            }
            System.out.println("}");
        } else {
            System.out.println("Not Possible");
        }
    }

    public static void main(String[] args) {
        splitarray_two_part sc = new splitarray_two_part();
        int arr[] = {1, 2, 3, 4, 5, 5};
        sc.canSplit(arr);
    }
}
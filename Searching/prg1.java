import java.util.List;
public class prg1 {
    
    public static void find(int arr[], int n, int x) {
        int i = 0, j = n;
        int k;
        do {
            k = (i + j) / 2;
            if (arr[k] < x) i = k + 1;
            else j = k;
        } while (i < j && arr[k] != x);

        if (arr[k] == x)
            System.out.println("x is in the array");
        else
            System.out.println("x is not in the array");
    }
}


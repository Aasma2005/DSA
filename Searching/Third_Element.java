import java.util.ArrayList;

public class Third_Element {
    static ArrayList<Integer> get3largest(int[] arr)
    {
        int fst = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        int thd = Integer.MIN_VALUE;

        // Find the first largest element
        for (int x : arr)
        {
            if (x > fst)
                fst = x;
        }

        // Find the second largest element
        for (int x : arr)
        {
            if (x > sec && x != fst)
                sec = x;
        }

        // Find the third largest element
        for (int x : arr)
        {
            if (x > thd && x != fst && x != sec)
                thd = x;
        }

        ArrayList<Integer> res = new ArrayList<>();
        if (fst == Integer.MIN_VALUE) return res;
        res.add(fst);
        if (sec == Integer.MIN_VALUE) return res;
        res.add(sec);
        if (thd == Integer.MIN_VALUE) return res;
        res.add(thd);

        return res;
    }

    public static void main(String[] args)
    {
        int[] arr = {12, 13, 1, 10, 34, 1};
        ArrayList<Integer> res = get3largest(arr);

        for (int x : res)
            System.out.print(x + " ");
        System.out.println();
    }
}

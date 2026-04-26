public class HollowDiamond {
    public static void main(String[] args) {
        int n=4;
        for (int i = 0; i < 2 * n - 1; i++) {

            int comp;
            if (i < n)
                comp = 2 * (n - i) - 1;
            else
                comp = 2 * (i - n + 1) + 1;

            // Print leading spaces
            for (int j = 0; j < comp; j++)
                System.out.print(" ");

            // Print stars and inner spaces
            for (int k = 0; k < 2 * n - comp; k++) {
                if (k == 0 || k == 2 * n - comp - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }
    }
}

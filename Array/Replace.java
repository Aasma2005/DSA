class Demo {
    static int replaceElement(int num) {

        if (num == 0) {
            return 5;
        }

        int result = 0;
        int place = 1;

        while (num > 0) {
            int digit = num % 10;

            if (digit == 0) {
                digit = 5;
            }

            result = digit * place + result;
            place = place * 10;
            num = num / 10;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(replaceElement(1005)); // 1555
        System.out.println(replaceElement(0));    // 5
        System.out.println(replaceElement(1020)); // 1525
    }
}

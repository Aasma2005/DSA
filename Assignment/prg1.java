class Demo {
    public static void main(String[] args) {
        int num = 1004;
        System.out.println(replaceZeroWithFive(num));
    }    
    static int replaceZeroWithFive(int num) {
        
        if (num == 0)
            return 0;

        int digit = num % 10;
        
        if (digit == 0)
            digit = 5;

        return replaceZeroWithFive(num / 10) * 10 + digit;
    }
}

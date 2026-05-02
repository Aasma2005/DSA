public class Solution {
    static boolean armstrongNumber(int n) {
        String number = Integer.toString(n);

        int length = number.length();
        int output = 0;

        for (char c : number.toCharArray()) {
            output += Math.pow(c - '0', length);
        }

        return output == Integer.parseInt(number);
    }

    public static void main(String[] args) {
        int n = 153;
        
        if (armstrongNumber(n)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    
}

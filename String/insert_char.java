class insert_char {
    static String insertChar(StringBuilder sb, char c, int pos) {
      
        // Insert character at specified position
        sb.insert(pos, c);
        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("asma");
        
        System.out.println(insertChar(sb, 'A', 3));
    }
}
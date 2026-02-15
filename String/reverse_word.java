// Input: s = "i.like.this.program.very.much" 
// Output: much.very.program.this.like.i
// Explanation: The words in the input string are reversed while maintaining the dots as separators, resulting in "much.very.program.this.like.i".

// Input: s = ”..geeks..for.geeks.” 
// Output: geeks.for.geeks

// Input: s = "...home......"
// Output: home

class reverse_word{
    public static void main(String[] args) {
        
        String s = "i.like.this.program.very.much";

        String[] words = s.split("\\.");  // split by dot

        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {

            if (!words[i].isEmpty()) {   // ignore empty words

                result.append(words[i]);

                if (i != 0)
                    result.append(".");
            }
        }

        System.out.println(result.toString());
    }
}
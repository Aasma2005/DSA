package Stack;

import java.util.Stack;

public class removing {
     public static void main(String args[])
    {
        // Creating an empty Stack
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(10);
        stack.push(15);
        stack.push(30);
        stack.push(20);
        stack.push(5);

        System.out.println("Initial Stack: " + stack);

        System.out.println("Popped element: "+ stack.pop());
        System.out.println("Popped element: "+ stack.pop());

        System.out.println("Stack after pop operation "+ stack);

        System.out.println("Is stack empty? "+ stack.empty());
        // Pop remaining elements
        stack.pop();
        stack.pop();
        stack.pop();

        // Check if the stack is empty
        System.out.println("Is stack empty? "
                           + stack.empty());
    }
}

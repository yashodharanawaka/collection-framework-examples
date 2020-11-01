package ListInterface;

import java.util.List;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();

        String search="hell";

        stack.push("hell");

        stack.add("a");
        stack.add("chip");
        stack.add("on");
        stack.add("your");
        stack.add("shoulder");

        System.out.println(stack);
        System.out.println("Where \"" +search+ "\" is located in the stack? "+stack.search(search));
        System.out.println("Stack size: "+stack.size());
        System.out.println("Peek the stack: "+stack.peek());

        System.out.println("Pop the item on top...");
        stack.pop();
        System.out.println("Updated Stack size: "+stack.size());
        System.out.println("Peek again: "+stack.peek());

        System.out.println("Pop the next item on top...");
        stack.pop();
        System.out.println("Updated Stack size: "+stack.size());
        System.out.println("Peek again: "+stack.peek());
        stack.remove(2);
        System.out.println(stack);
        System.out.println("Where \"" +search+ "\" is located in the stack? "+stack.search(search));
        System.out.println("Is the stack empty? "+stack.empty());

    }
}

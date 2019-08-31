package stackdemo;

import java.util.Iterator;
import java.util.Stack;

public class UseStack {

    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        int choice = 0;
        for(int i=1; i<5; i++) {
                stack.push("Plate: " + i);
        }
        Iterator it = stack.listIterator();
        while(it.hasNext()) {
            System.out.println(stack.pop());
        }
    }
}

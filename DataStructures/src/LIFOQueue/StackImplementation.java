package LIFOQueue;

import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> lifoQueue = new Stack<>();

        // Push elements to the stack
        lifoQueue.push(3);
        lifoQueue.push(6);
        lifoQueue.push(9);

        // Pop element 
        System.out.println("Popped: " + lifoQueue.pop()); 

        // Peek element 
        System.out.println("Peek: " + lifoQueue.peek());

        // Pop another element 
        System.out.println("Popped: " + lifoQueue.pop()); 

        // Check if the stack is empty
        System.out.println("Is empty: " + lifoQueue.isEmpty()); 

        System.out.println("Popped: " + lifoQueue.pop()); 

        // Check if the stack is empty again
        System.out.println("Is empty: " + lifoQueue.isEmpty()); 
}
    }

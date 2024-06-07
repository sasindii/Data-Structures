package LIFOQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class LIFODeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        
        // Push elements to deque
        deque.push(3);
        deque.push(6);
        deque.push(9);
        
        // Pop elements from deque
        while (!deque.isEmpty()) {
            System.out.println(deque.pop());
        }
    }
}

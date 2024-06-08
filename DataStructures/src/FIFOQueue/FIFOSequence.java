package FIFOQueue;

import java.util.LinkedList;
import java.util.Queue;

public class FIFOSequence {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        // Add elements to queue
        queue.add(2);
        queue.add(4);
        queue.add(6);
        
        // Remove elements from queue
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}

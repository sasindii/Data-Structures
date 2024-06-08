package Deque;



import java.util.LinkedList;
import java.util.Queue;

public class DequeUsingTwoQueues {
    private Queue<Integer> frontQueue;
    private Queue<Integer> rearQueue;

    public DequeUsingTwoQueues() {
        this.frontQueue = new LinkedList<>();
        this.rearQueue = new LinkedList<>();
    }

    // Add element to the front of the deque
    public void addFront(int item) {
        frontQueue.add(item);
    }

    // Add element to the rear of the deque
    public void addRear(int item) {
        rearQueue.add(item);
    }

    // Remove element from the front of the deque
    public int removeFront() {
        if (!frontQueue.isEmpty()) {
            return frontQueue.poll();
        }
        while (rearQueue.size() > 1) {
            frontQueue.add(rearQueue.poll());
        }
        return rearQueue.isEmpty() ? -1 : rearQueue.poll();
    }

    // Remove element from the rear of the deque
    public int removeRear() {
        if (!rearQueue.isEmpty()) {
            return rearQueue.poll();
        }
        while (frontQueue.size() > 1) {
            rearQueue.add(frontQueue.poll());
        }
        return frontQueue.isEmpty() ? -1 : frontQueue.poll();
    }

    // Peek element at the front of the deque
    public int peekFront() {
        if (!frontQueue.isEmpty()) {
            return frontQueue.peek();
        }
        while (!rearQueue.isEmpty()) {
            frontQueue.add(rearQueue.poll());
        }
        return frontQueue.isEmpty() ? -1 : frontQueue.peek();
    }

    // Peek element at the rear of the deque
    public int peekRear() {
        if (!rearQueue.isEmpty()) {
            return rearQueue.peek();
        }
        while (!frontQueue.isEmpty()) {
            rearQueue.add(frontQueue.poll());
        }
        return rearQueue.isEmpty() ? -1 : rearQueue.peek();
    }

    // Check if the deque is empty
    public boolean isEmpty() {
        return frontQueue.isEmpty() && rearQueue.isEmpty();
    }

    public static void main(String[] args) {
        DequeUsingTwoQueues deque = new DequeUsingTwoQueues();

        deque.addFront(1);
        deque.addRear(2);
        deque.addFront(3);

        System.out.println("Remove Front: " + deque.removeFront()); // Output: 3
        System.out.println("Peek Rear: " + deque.peekRear()); // Output: 2
        System.out.println("Remove Rear: " + deque.removeRear()); // Output: 2
        System.out.println("Remove Front: " + deque.removeFront()); // Output: 1
        System.out.println("Is Empty: " + deque.isEmpty()); // Output: true
    }
}


package LIFOQueue;

import java.util.LinkedList;
import java.util.Queue;

public class LIFOUsingTwoFIFO {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public LIFOUsingTwoFIFO() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int value) {
        queue2.add(value);
        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return queue1.remove();
    }

    public static void main(String[] args) {
        LIFOUsingTwoFIFO stack = new LIFOUsingTwoFIFO();
        stack.push(3);
        stack.push(6);
        stack.push(9);

        while (!stack.queue1.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

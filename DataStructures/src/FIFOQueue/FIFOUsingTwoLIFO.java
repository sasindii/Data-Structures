package FIFOQueue;

import java.util.Stack;

public class FIFOUsingTwoLIFO {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public FIFOUsingTwoLIFO() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void add(int value) {
        stack1.push(value);
    }

    public int remove() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        FIFOUsingTwoLIFO queue = new FIFOUsingTwoLIFO();
        queue.add(2);
        queue.add(4);
        queue.add(6);

        while (!queue.stack1.isEmpty() || !queue.stack2.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}

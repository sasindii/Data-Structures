package FIFOQueue;

public class FIFOArray {
    private int[] array;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public FIFOArray(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void add(int value) {
        if (size == capacity) {
            throw new RuntimeException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        array[rear] = value;
        size++;
    }

    public int remove() {
        if (size == 0) {
            throw new RuntimeException("Queue is empty");
        }
        int value = array[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    public static void main(String[] args) {
        FIFOArray queue = new FIFOArray(10);
        queue.add(2);
        queue.add(4);
        queue.add(6);

        while (queue.size != 0) {
            System.out.println(queue.remove());
        }
    }
}

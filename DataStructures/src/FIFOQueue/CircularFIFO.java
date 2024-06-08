package FIFOQueue;



public class CircularFIFO {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularFIFO(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
    	CircularFIFO queue = new CircularFIFO(3);

        queue.enqueue(6);
        queue.enqueue(4);
        queue.enqueue(2);

        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Peek: " + queue.peek()); 
        queue.enqueue(4);

        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Dequeued: " + queue.dequeue()); 

        System.out.println("Is empty: " + queue.isEmpty()); 
    }
}


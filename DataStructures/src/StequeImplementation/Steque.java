package StequeImplementation;

public class Steque<T> {
    private Node<T> front; // Points to the front of the steque
    private Node<T> rear;  // Points to the rear of the steque
    private int size;

    public Steque() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Push element to the front of the steque
    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            newNode.next = front;
            front = newNode;
        }
        size++;
    }

    // Pop element from the front of the steque
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Steque is empty");
        }
        T item = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return item;
    }

    // Enqueue element to the rear of the steque
    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // Check if the steque is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Get the size of the steque
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Steque<Integer> steque = new Steque<>();

        // Test push
        steque.push(1);
        steque.push(2);
        steque.push(3);

        System.out.println("Popped: " + steque.pop()); // Output: 3

        // Test enqueue
        steque.enqueue(4);
        steque.enqueue(5);

        System.out.println("Popped: " + steque.pop()); // Output: 2
        System.out.println("Popped: " + steque.pop()); // Output: 1
        System.out.println("Popped: " + steque.pop()); // Output: 4
        System.out.println("Popped: " + steque.pop()); // Output: 5

        // Check if steque is empty
        System.out.println("Is empty: " + steque.isEmpty()); // Output: true
    }
}

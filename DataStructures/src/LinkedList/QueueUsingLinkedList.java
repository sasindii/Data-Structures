package LinkedList;

public class QueueUsingLinkedList {
    
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Pointers to the front and rear of the queue
    private Node front, rear;

    // initialize the queue
    public QueueUsingLinkedList() {
        this.front = this.rear = null;
    }

    // add an element to the queue
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // remove an element from the queue
    public Integer dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return null;
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    // peek at the front element of the queue without removing it
    public Integer peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return null;
        }
        return front.data;
    }

    // check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // display the elements of the queue
    public void display() {
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " | ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method 
    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.display();

        System.out.println("Peek: " + queue.peek());
        
        System.out.println("Dequeue: " + queue.dequeue());
        queue.display();

        System.out.println("Dequeue: " + queue.dequeue());
        queue.display();

        System.out.println("Is queue empty? " + queue.isEmpty());

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Is queue empty? " + queue.isEmpty());

        // Attempt to dequeue from an empty queue
        System.out.println("Dequeue: " + queue.dequeue());
    }
}

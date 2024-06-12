package LinkedList;

public class StackUsingLinkedList {
    // Node class representing each element in the stack
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Top of the stack
    private Node top;

    // Constructor to initialize the stack
    public StackUsingLinkedList() {
        this.top = null;
    }

    // Method to push an element onto the stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Method to pop an element from the stack
    public Integer pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return null;
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    // Method to peek at the top element of the stack without removing it
    public Integer peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return null;
        }
        return top.data;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Method to display the stack
    public void display() {
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " | ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to demonstrate the stack operations
    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.display();

        System.out.println("Peek: " + stack.peek());
        
        System.out.println("Pop: " + stack.pop());
        stack.display();

        System.out.println("Pop: " + stack.pop());
        stack.display();

        System.out.println("Is stack empty? " + stack.isEmpty());

        System.out.println("Pop: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Attempt to pop from an empty stack
        System.out.println("Pop: " + stack.pop());
    }
}


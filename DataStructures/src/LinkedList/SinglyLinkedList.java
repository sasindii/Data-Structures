package LinkedList;

public class SinglyLinkedList {
    
        // Node class representing each element in the list
        class Node {
            int data;  // Data stored in the node
            Node next; // Reference to the next node
    
            // Constructor to initialize the node with data and set the next reference to null
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
    
        // Head of the list
        private Node head;
    
        // Constructor to initialize the list
        public SinglyLinkedList() {
            this.head = null;
        }
    
        // Method to insert a new node at the end of the list
        public void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }
    
        // Method to display the list
        public void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    
        // Method to delete a node by value
        public void delete(int data) {
            if (head == null) return;
    
            if (head.data == data) {
                head = head.next;
                return;
            }
    
            Node current = head;
            while (current.next != null && current.next.data != data) {
                current = current.next;
            }
    
            if (current.next != null) {
                current.next = current.next.next;
            }
        }
    
        // Method to search for a node by value
        public boolean search(int data) {
            Node current = head;
            while (current != null) {
                if (current.data == data) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }
    
        // Main method to demonstrate the functionality
        public static void main(String[] args) {
            SinglyLinkedList list = new SinglyLinkedList();
            list.insert(1);
            list.insert(2);
            list.insert(3);
            list.display();
    
            list.delete(2);
            list.display();
    
            System.out.println("Search 1: " + list.search(1));
            System.out.println("Search 2: " + list.search(2));
        }
    }
    


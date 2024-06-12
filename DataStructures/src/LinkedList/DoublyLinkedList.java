package LinkedList;

public class DoublyLinkedList {
    
        // Node class representing each element in the list
        class Node {
            int data;
            Node next;
            Node prev;
    
            Node(int data) {
                this.data = data;
                this.next = null;
                this.prev = null;
            }
        }
    
        // Head of the list
        private Node head;
    
        // Constructor to initialize the list
        public DoublyLinkedList() {
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
                newNode.prev = current;
            }
        }
    
        // Method to display the list
        public void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " | ");
                current = current.next;
            }
            System.out.println("null");
        }
    
        // Method to delete a node by value
        public void delete(int data) {
            if (head == null) return;
    
            if (head.data == data) {
                head = head.next;
                if (head != null) head.prev = null;
                return;
            }
    
            Node current = head;
            while (current != null && current.data != data) {
                current = current.next;
            }
    
            if (current != null) {
                if (current.next != null) current.next.prev = current.prev;
                if (current.prev != null) current.prev.next = current.next;
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
    
        public static void main(String[] args) {
            DoublyLinkedList list = new DoublyLinkedList();
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
    


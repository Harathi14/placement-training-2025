package day16;

class L_List {

    // Method to insert a node at the end of the linked list
    public void insert_At_End(int newData) {
        // Implementation needed
    }

    // Method to delete a node at the end of the linked list
    public void deleteAtEnd() {
        Node prev = null;
        Node current = head;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        prev.next = null;
    }

    // Method to print the linked list
    public void printList() {

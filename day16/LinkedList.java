package day16;
import org.w3c.dom.Node;
class L_List {
    public void insert_At_End(int newData) {
    }
    public void deleteAtEnd() {
        Node prev = null;
        Node head;
        Node current = head;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        prev.next = null;
    }
    public String toString() {
        return "L_List []";
    }

    public void printList() {

package day17;

import org.w3c.dom.Node;

class L_List{

    /**
     * @param data
     */
    void addLast(int data){
        Node newNode = new Node(data);

        Object head;
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = (Node) head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }
}

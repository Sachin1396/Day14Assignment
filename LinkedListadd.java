public class LinkedListadd {
    Node head;
    Node tail;
    int size;

    public void addNode(Node newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;

    }

    void display(INode head) {
        INode current = head;
        if (head == null)
            System.out.print("Linked list is empty");
        System.out.println("Nodes are");
        while (current != null) {
            if (current.getNext() != null) {
                System.out.print(current.getKey() + "-->");
                current = current.getNext();
            } else {
                System.out.println(current.getKey());
                current = current.getNext();
            }
        }

    }
}

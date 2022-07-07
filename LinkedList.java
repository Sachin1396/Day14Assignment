public class LinkedList {
    public static void main(String[] args) {
        LinkedListadd linkedlistAdd = new LinkedListadd();
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        linkedlistAdd.addNode(firstNode);
        linkedlistAdd.addNode(secondNode);
        linkedlistAdd.addNode(thirdNode);
        linkedlistAdd.display(firstNode);

    }
}

public class Task {
    public Node head;
    public Node tail;
    public int size;

    public Node createdLinkedList (String desc, String comstatus) {
        Node node = new Node();
        node.next = null;
        node.value = desc;
        node.value2 = comstatus;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void markTaskAsCompleted() {

    }
}
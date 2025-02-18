public class User {
    String arr[] = null;
    public Node head;
    public Node tail;
    public int size;


    public User (int sizeOfArray) {
        arr = new String[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = null;
        }
    }

    public void createUser (int location, String name) {
        try {
            if (arr[location] == null) {
                arr[location] = name;
                System.out.println("Successfully created user");
            } else {
                System.out.println("The location is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index top access array");
        }
    }

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

    public void addTaskInToDoList(String desc, String comstatus, int location) {
        Node node = new Node();
        node.value = desc;
        node.value2 = comstatus;
        if (head == null) {
            createdLinkedList(desc, comstatus);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >=  size) {
            tail.next = node;
            node.next = null;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = node;
            node.next = nextNode;
        }
        size++;
    }

    public void markTaskAsCompleted() {

    }

    public void printAllTasks() {

    }
}
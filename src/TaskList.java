import java.util.Objects;

public class TaskList {
    public Node head;
    public Node tail;
    public int size;

    public TaskList() {

    }

    public Node createdLinkedList (Task task) {
        Node node = new Node();
        node.next = null;
        node.value = task.getDesc();
        node.value2 = task.getComstatus();
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void addTaskInToDoList(Task task, int location) {
        Node node = new Node();
        node.value = task.getDesc();
        node.value2 = task.getComstatus();
        if (head == null) {
            createdLinkedList(task);
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

    public void markTaskAsCompleted(Task task) {
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            if (Objects.equals(tempNode.value, task.getDesc())) {
                if (Objects.equals(tempNode.value2, "completed")) {
                    System.out.println("Task already marked as completed!");
                    break;
                } else {
                    task.markTaskAsCompleted();
                    tempNode.value2 = "completed";
                    break;
                }
            }
        tempNode = tempNode.next;
        }
    }

    public void printAllTasks() {
        System.out.println("To Do List");
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.println("Description = " + tempNode.value + ", " + "Completion Status = " + tempNode.value2);
            tempNode = tempNode.next;
        }
        System.out.println();
    }
}

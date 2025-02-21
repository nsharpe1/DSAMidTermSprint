import java.util.Objects;

public class Task {
    public String desc;
    public String comstatus;
    public Node head;
    public Node tail;
    public int size;

    public Task() {

    }

    public Task(String desc, String comstatus) {
        this.desc = desc;
        this.comstatus = comstatus;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getComstatus() {
        return comstatus;
    }

    public void setComstatus(String comstatus) {
        this.comstatus = comstatus;
    }

    public void markTaskAsCompleted() {
        this.comstatus = "completed";
        System.out.println("Completion status changed to 'completed'");
    }

    @Override
    public String toString() {
        return "Task{" +
                "desc='" + desc + '\'' +
                ", comstatus='" + comstatus + '\'' +
                '}';
    }
}
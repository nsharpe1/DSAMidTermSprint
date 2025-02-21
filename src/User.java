import java.util.Objects;

public class User {
    private String name;
    private TaskList taskList;

    public User (String name, TaskList taskList) {
        this.name = name;
        this.taskList = taskList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskList getTaskList() {
        return taskList;
    }

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", taskList=" + taskList +
                '}';
    }
}
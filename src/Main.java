public class Main {
    public static void main(String[] args) {
        User userArray = new User(2);
        userArray.createUser(0, "admin");
        userArray.createUser(1, "user");

        TaskList taskListForAdmin = new TaskList(); // "admin" to go in brackets
        taskListForAdmin.addTaskInToDoList("Go shopping", "pending", 0);
        taskListForAdmin.addTaskInToDoList("Walk dog", "completed", 1);
        taskListForAdmin.addTaskInToDoList("Shovel driveway", "pending", 2);
        taskListForAdmin.addTaskInToDoList("Pay bills", "completed", 3);

        TaskList taskListForUser = new TaskList(); // "user" to go in brackets
        taskListForUser.addTaskInToDoList("Walk dog", "completed", 0);
        taskListForUser.addTaskInToDoList("Go shopping", "pending", 1);
        taskListForUser.addTaskInToDoList("Pay bills", "completed", 2);
        taskListForUser.addTaskInToDoList("Shovel driveway", "pending", 3);
    }
}

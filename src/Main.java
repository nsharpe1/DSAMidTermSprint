public class Main {
    public static void main(String[] args) {
        // User 1
        TaskList toDoListForAdmin = new TaskList();
        User user1 = new User("admin", toDoListForAdmin);
        Task adminTask1 = new Task("Go shopping", "pending");
        Task adminTask2 = new Task("Walk dog", "completed");
        Task adminTask3 = new Task("Shovel driveway", "pending");
        Task adminTask4 = new Task("Pay bills", "completed");
        toDoListForAdmin.addTaskInToDoList(adminTask1, 0);
        toDoListForAdmin.addTaskInToDoList(adminTask2, 1);
        toDoListForAdmin.addTaskInToDoList(adminTask3, 2);
        toDoListForAdmin.addTaskInToDoList(adminTask4, 3);
        user1.getTaskList().printAllTasks();

        toDoListForAdmin.markTaskAsCompleted(adminTask1);
        toDoListForAdmin.markTaskAsCompleted(adminTask2);
        user1.getTaskList().printAllTasks();

        // User 2
//        TaskList toDoListForUser = new TaskList();
//        User user2 = new User("user", toDoListForUser);
//        Task userTask1 = new Task("Go shopping", "pending");
//        Task userTask2 = new Task("Walk dog", "completed");
//        Task userTask3 = new Task("Shovel driveway", "pending");
//        Task userTask4 = new Task("Pay bills", "completed");
//        toDoListForUser.addTaskInToDoList(userTask1, 0);
//        toDoListForUser.addTaskInToDoList(userTask2, 1);
//        toDoListForUser.addTaskInToDoList(userTask3, 2);
//        toDoListForUser.addTaskInToDoList(userTask4, 3);
//
//        toDoListForUser.markTaskAsCompleted(userTask3);
//        toDoListForUser.markTaskAsCompleted(userTask4);
    }
}

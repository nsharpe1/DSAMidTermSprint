public class Main {
    public static void main(String[] args) {
        // Creating users array
        UsersArray usersArray = new UsersArray(2);

        //User 1 (Title)
        System.out.println("User 1:");
        System.out.println();

        //User 1 (Creates users and adds them to an array)
        TaskList toDoListForAdmin = new TaskList();
        User user1 = new User("admin", toDoListForAdmin);
        usersArray.addUserToUsersArray(0, user1);

        //User 1 (Adds tasks to users' to-do lists)
        Task adminTask1 = new Task("Go grocery shopping", "pending");
        Task adminTask2 = new Task("Walk the dog", "completed");
        Task adminTask3 = new Task("Shovel driveway", "pending");
        Task adminTask4 = new Task("Pay bills", "completed");
        toDoListForAdmin.addTaskInToDoList(adminTask1, 0);
        toDoListForAdmin.addTaskInToDoList(adminTask2, 1);
        toDoListForAdmin.addTaskInToDoList(adminTask3, 2);
        toDoListForAdmin.addTaskInToDoList(adminTask4, 3);
        user1.getTaskList().printAllTasks();

        // User 1 (Marks tasks as completed)
        toDoListForAdmin.markTaskAsCompleted(adminTask1);
        toDoListForAdmin.markTaskAsCompleted(adminTask4);
        System.out.println();
        user1.getTaskList().printAllTasks();

        //User 2 (Title)
        System.out.println("User 2:");
        System.out.println();

        //User 2 (Creates users and adds them to an array)
        TaskList toDoListForUser = new TaskList();
        User user2 = new User("user", toDoListForUser);
        usersArray.addUserToUsersArray(1, user2);

        //User 2 (Adds tasks to users' to-do lists)
        Task userTask1 = new Task("Pay bills", "completed");
        Task userTask2 = new Task("Shovel driveway", "pending");
        Task userTask3 = new Task("Walk the dog", "completed");
        Task userTask4 = new Task("Go grocery shopping", "pending");
        toDoListForUser.addTaskInToDoList(userTask1, 0);
        toDoListForUser.addTaskInToDoList(userTask2, 1);
        toDoListForUser.addTaskInToDoList(userTask3, 2);
        toDoListForUser.addTaskInToDoList(userTask4, 3);
        user2.getTaskList().printAllTasks();

        // User 2 (Marks tasks as completed)
        toDoListForUser.markTaskAsCompleted(userTask2);
        toDoListForUser.markTaskAsCompleted(userTask3);
        System.out.println();
        user2.getTaskList().printAllTasks();

        // Printing out users array
        System.out.println("Users Array:");
        System.out.println();
        usersArray.traverseUsersArray();
    }
}

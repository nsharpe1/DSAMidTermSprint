import java.util.Arrays;

public class UsersArray {
    private User[] users;
    private User user;

    public UsersArray(User[] users) {
        this.users = users;
    }

    public UsersArray (int sizeOfArray){
        users = new User[sizeOfArray];
        for (int i = 0; i < users.length; i++){
            users[i] = null;
        }
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public void addUserToUsersArray (int location, User user){
        try {
            if (users[location] == null) {
                users[location] = user;
                System.out.println("Successfully inserted new user!");
                System.out.println();
            } else {
                System.out.println("The location is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index top access array");
        }
    }

    public void traverseUsersArray(){
        try {
            for (int i = 0; i < users.length; i++) {
                System.out.print(users[i].getName() + "'s ");
                users[i].getTaskList().printAllTasks();
            }
        } catch (Exception e) {
            System.out.println("Array no longer exist");
        }
    }

    @Override
    public String toString() {
        return "UsersArray{" +
                "users=" + Arrays.toString(users) +
                '}';
    }
}
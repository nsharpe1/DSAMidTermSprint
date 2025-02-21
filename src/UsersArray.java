import java.util.Arrays;

public class UsersArray {
    private User[] users;
    private User user;

    public UsersArray(User[] users) {
        this.users = users;
    }

    public void createUsersArray (int sizeOfArray){
        users = new User[sizeOfArray];
        for (int i = 0; i < users.length; i++){
            users[i] = Integer.MIN_VALUE;
        }
    }

    public void addUserToUsersArray (int location, User user){
        try {
            if (users[location] == Integer.MIN_VALUE) {
                users[location] = user;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("The location is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index top access array");
        }
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UsersArray{" +
                "users=" + Arrays.toString(users) +
                '}';
    }
}
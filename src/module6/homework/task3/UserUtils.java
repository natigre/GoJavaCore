package module6.homework.task3;

import module6.homework.task2.User;
import java.util.Arrays;

public class UserUtils {

    public static User[] uniqueUsers(User[] users) {
        User[] uniqueUsers = new User[0];
        for (User user : users) {
            if (user != null) {
                boolean checkedUser = true;
                for (User uniqueU : uniqueUsers) {
                    if (user.equals(uniqueU)) {
                        checkedUser = false;
                    }
                }
                if (checkedUser) {
                    uniqueUsers = addUsersToArray(uniqueUsers, user);
                }
            }
        }
        System.out.println("These are unique Users:");
        return uniqueUsers;
    }

    public static User[] userWithConditionalBalance(User[] users, int balance) {
        User[] conditionalUsers = new User[0];
        for (User user : users) {
            if (user != null && user.getBalance() == balance) {
                conditionalUsers = addUsersToArray(conditionalUsers, user);
            }
        }
        System.out.println("Users with the same balance:");
        return conditionalUsers;
    }

    public static final User[] paySalaryToUsers(User[] users) {
        for (User user : users) {
            if (user != null) {
                user.paySalary();
            }
        }
        System.out.println("Salary payment to all employees:");
        return users;
    }

    public static final long[] getUserId(User[] users) {
        long[] userId = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                userId[i] = users[i].getId();
            }
        }
        System.out.println("ID of all users:");
        return userId;
    }

    public static User[] deleteEmptyUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                System.arraycopy(users, i + 1, users, i, users.length - i - 1 );
                users = Arrays.copyOfRange(users, 0, users.length - 1);
            }
        }
        System.out.println("Deleting all non-filled users:");
        return users;
    }

    private static User[] addUsersToArray(User[] oldUsers, User user) {
        User[] newUsers = Arrays.copyOf(oldUsers, oldUsers.length + 1);
        newUsers[newUsers.length - 1] = user;
        return newUsers;
    }
}

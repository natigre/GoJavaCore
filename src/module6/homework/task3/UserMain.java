package module6.homework.task3;

import module6.homework.task2.User;

import java.util.Arrays;

public class UserMain {
    public static void main(String[] args) {

        User[] users = {new User(1, "Maria", "Guda", 2500, 62000),
                new User(2, "Denis", "Calo", 2500, 35000),
                new User(3, "Oksana", "Hrebeniuk", 5000, 55000),
                new User(4, "Oleg", "Savinov", 1500, 15000),
                new User(5, null, null, 0, 0),
                new User(6, "Alex", "Mirov", 6000, 25000),
                new User(7, "Nina", "Mazur", 4500, 40000),
                new User(8, "Yurii", "Tcarev", 2000, 70000),
                new User(9, null, null, 0, 0),
                new User(10, "Irina", "Petrova", 3000, 21000)};

        for (User user : UserUtils.uniqueUsers(users)) {
            System.out.println(user);
        }

        for (User user : UserUtils.userWithConditionalBalance(users, 1200)) {
            System.out.println(user);
        }

        for (User user : UserUtils.paySalaryToUsers(users)) {
            System.out.println(user);
        }

        //        System.out.println("Test immutable " + users[0].getBalance());

        long[] userId = UserUtils.getUserId(users);
        System.out.println(Arrays.toString(userId));

        for (User user : UserUtils.deleteEmptyUsers(users)) {
            System.out.println(user);
        }
    }
}

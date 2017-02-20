package module4.homework;

public class Main {
    public static void main(String[] args) {
        Bank usBank = new USBank(12540, "USA", Currency.USD, 30, 20000, 5, 10000000);
        Bank euBank = new EUBank(15510, "Italy", Currency.EUR, 150, 10000, 10, 6000000);
        Bank chinaBank = new ChinaBank(12420, "China", Currency.USD, 1020, 8000, 25, 500000);

        User user1 = new User(12983736256L, "Lesya", 223, 23, "Company1", 23000, usBank);
        User user2 = new User(23985746389L, "Ihor", 2200, 2, "Company2", 5000, euBank);
        User user3 = new User(16278493726L, "Vova", 874, 10, "Company3", 12000, chinaBank);
        User user4 = new User(38926473848L, "Lena", 10043, 30, "Company4", 6800, usBank);
        User user5 = new User(20098783783L, "Misha", 9456, 9, "Company5", 11000, euBank);
        User user6 = new User(30029788439L, "Ira", 35640, 44, "Company6", 40000, chinaBank);

        BankSystemImpl bankSystem = new BankSystemImpl();

        User[] users = {user1, user2, user3, user4, user5, user6};
        for (User user : users) {
            int fundingAmount = 100;
            int withdrawAmount = 1000;
            System.out.println("Performing operations with user " + user.getName());
            System.out.println("Funding " + user.getBank().getCurrency() + " " + fundingAmount);
            bankSystem.fundUser(user, fundingAmount);
            System.out.println("Paying Salary " + user.getBank().getCurrency() + " " + user.getSalary());
            bankSystem.paySalary(user);
            System.out.println("Withdrawing " + user.getBank().getCurrency() + " " + withdrawAmount);
            bankSystem.withdrawOfUser(user, withdrawAmount);
            System.out.println("Balance: " + user.getBank().getCurrency() + " " + user.getBalance());
            System.out.println("\n");
        }
    }
}

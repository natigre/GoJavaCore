package module2.homework;

public class Bank3 {
    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Oww";
        double withdrawal = 100;

        withdrawBalance(ownerName, ownerNames, balances, withdrawal);
    }

    static void withdrawBalance(String ownerName, String[] ownerNames, int[] balances, double withdrawal) {
        int balance = 0;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerName == ownerNames[i])
                balance = (int) (balances[i] + withdrawal);
        }
        System.out.println(ownerName + " " + balance);
    }
}

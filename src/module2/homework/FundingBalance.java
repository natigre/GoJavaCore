package module2.homework;

public class FundingBalance {

    static void withdrawBalance(String ownerName, String[] ownerNames, int[] balances, double withdrawal) {
        int balanceAfter = 0;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerName.equals(ownerNames[i]))
                balanceAfter = (int)(balances[i] + withdrawal);
        }
        System.out.println(ownerName + " " + balanceAfter);

    }
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Oww";
        double withdrawal = 100;
        withdrawBalance(ownerName, ownerNames, balances, withdrawal);
    }
}

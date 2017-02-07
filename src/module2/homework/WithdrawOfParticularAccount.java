package module2.homework;

public class WithdrawOfParticularAccount {

    static void withdrawBalance(String ownerName, String[] ownerNames, int[] balances, double withdrawal) {
        double commissionRate = 0.05;
        double commission = (withdrawal * commissionRate);
        double withdrawAfter = withdrawal + commission;

        int count = 0;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerName == (ownerNames[i])) {
                double balanceAfter = balances[i] - withdrawAfter;

                if (withdrawAfter <= balances[i]) {
                    System.out.println(ownerName + " " + (int) withdrawal + " " + (int) balanceAfter);

                    balances[i] = (int) balanceAfter;
                } else {
                    System.out.println("NO");
                }
            } else {
                count++;
            }
        }
    }

    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Ann";
        double withdrawal = 100;
        withdrawBalance(ownerName, ownerNames, balances, withdrawal);

        ownerName = "Oww";
        withdrawal = 490;
        withdrawBalance(ownerName, ownerNames, balances, withdrawal);
    }
}







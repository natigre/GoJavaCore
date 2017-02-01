package module2.homework;

public class Bank2 {
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

    static void withdrawBalance(String ownerName, String[] ownerNames, int[] balances, double withdrawal) {
        double commision_rate = 0.05;
        double commision = (withdrawal * commision_rate);
        int count = 0;

        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerName == (ownerNames[i])) {
                double balance = balances[i] - (withdrawal + commision);
                if ((withdrawal + commision) <= balances[i]) {
                    System.out.println(ownerName + " " + (int) withdrawal + " " + (int) balance);
                    balances[i] = (int) balance;
                } else {
                    System.out.println("NO");
                }
            } else {
                count++;
            }
        }
    }
}







package module2.homework;

public class Bank2 {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName1 = "Ann";
        double withdrawal3 = 100;

        String ownerName2 = "Oww";
        double withdrawal4 = 490;

        withdraw_money(ownerName1, withdrawal3, ownerNames, balances);
        System.out.println("");
        withdraw_money(ownerName2, withdrawal4, ownerNames, balances);
    }


    public static int[] withdraw_money(String ownerName, double withdrawal, String[] array, int[] balance) {

        double commision_rate = 0.05;
        double commision = (withdrawal * commision_rate);
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (ownerName == array[i]) {
                double new_balance = balance[i] - (withdrawal + commision);
                if ((withdrawal + commision) <= balance[i]) {
                    System.out.println(ownerName + " " + (int) withdrawal + " " + (int) new_balance);
                    balance[i] = (int) new_balance;
                } else {
                    System.out.println("NO");
                }
            } else {
                count++;
            }
        }

        if (count == array.length)
            System.out.println("No client found");
        return balance;
    }
}


package module2.homework;

public class CashWithdrawal {

    public static void withdrawBalance(double balance, double withdrawal) {
        double commissionRate = 0.05;
        double commission = withdrawal * commissionRate;
        double withdrawAfter = withdrawal + commission;
        double balanceAfter = balance - withdrawAfter;

        if (withdrawAfter <= balance) {
            System.out.println("OK" + " " + commissionRate + " " + balanceAfter);
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        int balance = 100;
        int withdrawal = 10;
        withdrawBalance(balance, withdrawal);

        balance = 100;
        withdrawal = 99;
        withdrawBalance(balance, withdrawal);
    }
}

package module2.homework;

public class Bank {

    public static void withdrawBalance(double balance, double withdrawal) {
        double commission = withdrawal * 0.05;
        double withdrawAfter = withdrawal + commission;

        if (withdrawAfter > balance)
            System.out.println("NO");
        else
            System.out.println("OK" + " " + "0.5" + " " + (balance - withdrawAfter ));
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
package module4.homework;

public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        double balance = user.getBalance();
        int commissionWithdraw = user.getBank().getCommission(amount);
        double withdrawalCommission = amount * commissionWithdraw / 100;
        int limitOfWithdraw = user.getBank().getLimitOfWithdrawal();
        if (amount > limitOfWithdraw) {
            System.out.println("Canceled. You have exceeded the limit of withdrawal of " + user.getBank().getLimitOfWithdrawal());
        } else if (amount + withdrawalCommission > balance) {
            System.out.println("Canceled. This operation cannot be performed.");
        } else {
            user.setBalance(balance - amount - withdrawalCommission);
            System.out.println("Success. ");
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        double balance = user.getBalance();
        int fundLimit = user.getBank().getLimitOfFunding();
        if (amount > fundLimit) {
            System.out.println("Canceled. You have exceeded the limit of funding for " + user.getBank().getLimitOfFunding());
        } else {
            user.setBalance(balance + amount);
            System.out.println("Success. ");
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double fromBalance = fromUser.getBalance();
        double toBalance = toUser.getBalance();
        if (amount > fromBalance) {
            System.out.println("Canceled. This operation cannot be performed.");
        } else {
            fromUser.setBalance(fromBalance - amount);
            toUser.setBalance(toBalance + amount);
            System.out.println("Success. ");
        }
    }

    @Override
    public void paySalary(User user) {
        double balance = user.getBalance();
        double salary = user.getSalary();
        double commission = balance * user.getBank().getMonthlyRate() / 100;
        user.setBalance(balance + salary - commission);
        System.out.println("Success. ");
    }
}

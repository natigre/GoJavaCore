package module3.homework.task4;

public class User {
    private String name;
    private String companyName;
    private String currency;
    private int balance;
    private int monthsOfEmployment;
    private int salary;

    public User(String name, String companyName, String currency, int balance, int monthsOfEmployment, int salary) {
        this.name = name;
        this.companyName = companyName;
        this.currency = currency;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.salary = salary;
    }

    public void paySalary() {
        this.balance += salary;
    }

   public void withdraw(int sum) {
        if (sum < 1000) {
            this.balance -= sum + sum * 5 / 100;
        } else {
            this.balance -= sum + sum * 10 / 100;
        }
       if (this.balance >= sum) {
           this.balance -= sum;
       } else {
           System.out.println("Withdrawal failed!\nInsufficient funds!");
       }
    }

    public int companyNameLength() {
        return this.companyName.length();
    }

   private void monthsOfEmployment(int addMonth) {
        this.monthsOfEmployment += addMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

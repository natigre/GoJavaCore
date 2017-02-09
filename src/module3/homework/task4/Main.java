package module3.homework.task4;

public class Main {
    public static void main(String[] args) {
        User user = new User("Natalia Hrebeniuk", "KUEC", "UAH", 1000, 8 * 12 + 10, 100);

        System.out.println("User: " + user.getName());
        System.out.println("Employer: " +
                user.getCompanyName() +
                " (" + user.companyNameLength()
                + " chars)");
        System.out.println("Term of employment: " + user.getMonthsOfEmployment() + " months");
        System.out.println("Account balance before salary: " + user.getBalance());
        System.out.println("Salary: " + user.getSalary());

        user.paySalary();

        System.out.println("Account balance after salary: " + user.getBalance());
        System.out.println("New term of employment: "
                + user.getMonthsOfEmployment()
                + " months");

        int withdrawal = 1000;
        user.withdraw(withdrawal);
        System.out.println("Account balance after withdrawing "
                + user.getCurrency() + " "
                + withdrawal + ": "
                + user.getBalance());
    }
}

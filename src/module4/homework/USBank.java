package module4.homework;

public class USBank extends Bank {


    public USBank(long id, String bankCountry, Currency currency,
                  int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) {
            return 1000;
        } else if (getCurrency() == Currency.EUR) {
            return 1200;
        } else {
            return -1;
        }
    }

    @Override
    int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR) {
            return 10000;
        } else if (getCurrency() == Currency.USD) {
            return Integer.MAX_VALUE;
        } else {
            return -1;
        }
    }

    @Override
    int getMonthlyRate() {
        if (getCurrency() == Currency.USD) {
            return 1;
        } else if (getCurrency() == Currency.EUR) {
            return 2;
        } else {
            return -1;
        }
    }

    @Override
    int getCommission(int sum) {
        if (getCurrency() == Currency.USD) {
            if (sum <= 1000) {
                return 5;
            } else {
                return 7;
            }
        } else if (getCurrency() == Currency.EUR) {
            if (sum <= 1000) {
                return 6;
            } else {
                return 8;
            }
        } else {
            return -1;
        }
    }
}


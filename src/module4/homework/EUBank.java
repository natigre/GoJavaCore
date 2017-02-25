package module4.homework;

import static module4.homework.Currency.*;
import static module4.homework.Currency.USD;

public class EUBank extends Bank {


    public EUBank(long id, String bankCountry, Currency currency,
                  int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (getCurrency() == USD) {
            return 2000;
        } else if (getCurrency() == EUR) {
            return 2200;
        } else {
            return -1;
        }
    }

    @Override
    public int getLimitOfFunding() {
        if (getCurrency() == USD) {
            return 10000;
        } else if (getCurrency() == EUR) {
            return 20000;
        } else {
            return -1;
        }
    }

    @Override
    public int getMonthlyRate() {
        if (getCurrency() == USD) {
            return 0;
        } else if (getCurrency() == EUR) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public int getCommission(int sum) {
        if (getCurrency() == USD) {
            if (sum <= 1000) {
                return 5;
            } else {
                return 7;
            }
        } else if (getCurrency() == EUR) {
            if (sum <= 1000) {
                return 2;
            } else {
                return 4;
            }
        } else {
            return -1;
        }
    }
}

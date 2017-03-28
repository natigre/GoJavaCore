package module6.homework.task4;

import static module6.homework.task4.CitizenFactory.*;

public class CitizenMain {
    public static void main(String[] args) {
        Citizen[] citizens = new Citizen[]{getEnglishman(), getChinese(),
                getRussian(), getItalian()};

        for (Citizen citizen : citizens) {
            citizen.sayHello();
        }
    }
}

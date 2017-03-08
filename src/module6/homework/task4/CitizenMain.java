package module6.homework.task4;

public class CitizenMain {
    public static void main(String[] args) {
        Citizen[] citizens = new Citizen[]{CitizenFactory.getEnglishman(), CitizenFactory.getChinese(),
                CitizenFactory.getRussian(), CitizenFactory.getItalian()};

        for (Citizen citizen : citizens) {
            citizen.sayHello();
        }
    }
}

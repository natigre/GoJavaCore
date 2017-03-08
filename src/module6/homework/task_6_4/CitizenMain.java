package module6.homework.task_6_4;

public class CitizenMain {
    public static void main(String[] args) {
        Citizen[] citizens = new Citizen[]{CitizenFactory.getEnglishman(), CitizenFactory.getChinese(),
                CitizenFactory.getRussian(), CitizenFactory.getItalian()};

        for (Citizen citizen : citizens) {
            citizen.sayHello();
        }
    }
}

package module6.homework.task_6_4;

public class CitizenFactory {

    private static class Englishman implements Citizen {

        @Override
        public void sayHello() {
            System.out.println("Hello!");
        }
    }

    private static class Chinese implements Citizen {

        @Override
        public void sayHello() {
            System.out.println("你好!");
        }
    }

    private static class Russian implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("Привет!");
        }
    }

    private static class Italian implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("Ciao!");
        }
    }

    public static Citizen getEnglishman() {
        return new Englishman();
    }

    public static Citizen getChinese() {
        return new Chinese();
    }

    public static Citizen getRussian() {
        return new Russian();
    }

    public static Citizen getItalian() {
        return new Italian();
    }
}

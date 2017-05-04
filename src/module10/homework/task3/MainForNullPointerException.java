package module10.homework.task3;

public class MainForNullPointerException {
    public static void main(String[] args) {
        String s = null;
        try {
           s.toString();
        } catch (NullPointerException e) {
            System.err.println("Exception was caught: " + e);
        }
    }
}


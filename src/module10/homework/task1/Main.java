package module10.homework.task1;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            throw new Exception("Axception in main");
        } catch (Exception e) {
            System.out.println("e.getMessage = " + e.getMessage());
        }
        finally {
            System.out.println("It's work in finally clause!");
        }
    }
}

package module10.homework.task2;

public class MyExceptionMain {
    public static void main(String[] args) {
        try {
            throw new MyException("Example of MyException.");
        } catch (MyException e) {
            e.printMsg();
        }
    }
}

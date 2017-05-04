package module10.homework.task2;

public class MyException extends Exception {
    private String string;

    public MyException(String string) {
        this.string = string;
    }

    public void printMsg() {
        System.out.println("Print message = " + string);
    }
}

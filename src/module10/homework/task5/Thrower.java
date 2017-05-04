package module10.homework.task5;

public class Thrower {
    public void f() throws ExceptionExample1, ExceptionExample2, ExceptionExamlpe3 {
        if (true) {
            throw new ExceptionExample1();
        } if (true) {
            throw new ExceptionExample2();
        } else {
            throw new ExceptionExamlpe3();
        }
    }
}

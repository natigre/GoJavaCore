package module10.homework.Task4;

public class UsingException {
    public void g() throws MyException {
        throw new MyException();
    }

    public void f() throws AnotherException {
        try {
            g();
        } catch (MyException e) {
            throw new AnotherException();
        }
    }

    public static void main(String[] args) {
        UsingException ue = new UsingException();
        try {
            ue.f();
        } catch (AnotherException e) {
            System.out.println("Caught " + e);
        }
    }
}

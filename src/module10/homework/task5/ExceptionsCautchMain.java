package module10.homework.task5;

import module10.homework.Task4.MyException;

public class ExceptionsCautchMain {
    public static void main(String[] args) {
        Thrower thrower = new Thrower();
        try {
            thrower.f();
        } catch (NewException e) {
            System.out.println("Caught " + e);
        } catch (Exception e) {
            System.out.println("Caught " + e);
        }
    }
}

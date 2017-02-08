package module3.homework.task1;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("Crow");

        System.out.println("I'm  " + bird.getName());
        System.out.println("==================");

        bird.sing("walking");
        bird.sing("flying");
        bird.sing("singing");
        bird.sing("bird");
    }
}

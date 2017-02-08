package module3.homework.task1;

public class Bird {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public void sing(String word) {
        System.out.println("I am " + word);
    }

    public String getName() {
        return name;
    }
}


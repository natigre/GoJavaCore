package module8.homework;

public final class IdGeneratorUtil {

    private static long idCount = 1;

    private IdGeneratorUtil() {
    }

    public static long generateId() {
        return idCount++;
    }
}

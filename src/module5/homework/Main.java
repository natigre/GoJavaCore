package module5.homework;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        System.out.println("Request rooms ");
        controller.requestRooms(560, 2, "Krivij Rih", "Druzhba");
        controller.requestRooms(400, 1, "Krivij Rih", "Richka");
        controller.requestRooms(620, 2, "Krivij Rih", "West");
        System.out.println("");

        API api1 = new GoogleAPI();
        API api2 = new BookingComAPI();
        API api3 = new TripAdvisorAPI();
        System.out.println("Check matches in apis ");
        controller.check(api1, api2);
        controller.check(api3, api1);
        controller.check(api2, api3);
    }
}

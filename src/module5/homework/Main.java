package module5.homework;

public class Main {
    public static void main(String[] args) {

        ProductController productController = new ProductController();
        System.out.println("Request rooms ");
        productController.requestRooms(560, 2, "Krivij Rih", "Druzhba");
        productController.requestRooms(400, 1, "Krivij Rih", "Richka");
        productController.requestRooms(620, 2, "Krivij Rih", "West");
        System.out.println("");

        BaseApi baseApi1 = new GoogleApi();
        BaseApi baseApi2 = new BookingComApi();
        BaseApi baseApi3 = new TripAdvisorApi();
        System.out.println("Check matches in apis ");
        productController.check(baseApi1, baseApi2);
        productController.check(baseApi3, baseApi1);
        productController.check(baseApi2, baseApi3);
    }
}

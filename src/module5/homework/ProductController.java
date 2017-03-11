package module5.homework;

public class ProductController {

    private BaseApi baseApis[] = new BaseApi[3];

        public ProductController() {
        baseApis[0] = new BookingComApi();
        baseApis[1] = new GoogleApi();
        baseApis[2] = new TripAdvisorApi();
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {

        Room[] bookingCom = baseApis[0].findRooms(price, persons, city, hotel);
        Room[] tripAdvisor = baseApis[1].findRooms(price, persons, city, hotel);
        Room[] google = baseApis[2].findRooms(price, persons, city, hotel);

        // create new array for all elements
        Room rooms[] = new Room[bookingCom.length + tripAdvisor.length + google.length];
        System.arraycopy(google, 0, rooms, bookingCom.length + tripAdvisor.length, google.length);

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.println(rooms[i]);
            }
        }
        return rooms;
    }

    public Room[] check(BaseApi baseApi1, BaseApi baseApi2) {
        Room[] roomApi1 = baseApi1.getAll();
        Room[] roomApi2 = baseApi2.getAll();
        Room[] checkedRooms = new Room[10];
        for (int i = 0; i < roomApi1.length; i++) {
            for (int j = 0; j < roomApi2.length; j++) {
                if (roomApi1[i].equals(roomApi2[j])) {
                    checkedRooms[i] = roomApi1[i];
                    System.out.println(roomApi1[i]);
                }
            }
        }
        return recreateArray(checkedRooms);
    }
    public Room[] recreateArray(Room[] rooms) {
        int k = 0;
        for (Room room : rooms) {
            if (room != null) k++;
        }
        Room[] roomsArray = new Room[k];
        for (int i = 0; i < k; i++) {
            roomsArray[i] = rooms[i];
        }
        return roomsArray;
    }
}



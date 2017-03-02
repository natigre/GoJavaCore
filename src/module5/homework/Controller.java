package module5.homework;

public class Controller {

    private API apis[] = new API[3];

        public Controller() {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {

        Room[] bookingCom = apis[0].findRooms(price, persons, city, hotel);
        Room[] tripAdvisor = apis[1].findRooms(price, persons, city, hotel);
        Room[] google = apis[2].findRooms(price, persons, city, hotel);

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

    public Room[] check(API api1, API api2) {
        Room[] roomApi1 = api1.getAll();
        Room[] roomApi2 = api2.getAll();
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



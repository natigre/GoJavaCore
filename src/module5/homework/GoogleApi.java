package module5.homework;

import java.util.Date;

public class GoogleApi implements BaseApi {

    private Room[] rooms = new Room[5];

    public GoogleApi() {
        Date date = new Date();
        rooms[0] = new Room(25, 800, 2, date, "Reikartz", "Krivij Rih");
        rooms[1] = new Room(24, 560, 2, date, "Druzhba", "Krivij Rih");
        rooms[2] = new Room(11, 400, 1, date, "Richka", "Krivij Rih");
        rooms[3] = new Room(20, 360, 1, date, "Saksagan", "Krivij Rih");
        rooms[4] = new Room(15, 620, 2, date, "West", "Krivij Rih");
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] founded = new Room[5];
        Room requested = new Room(0, price, persons, null, hotel, city);

        int index = 0;
        for (Room room : rooms) {
            if (hotel != null) {
                if (room.equals(requested) && hotel.equals(room.getHotelName())) {
                    founded[index] = room;
                    System.out.println(founded[index]);
                    index++;
                }
            }
        }
        return founded;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}

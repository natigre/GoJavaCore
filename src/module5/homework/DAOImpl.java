package module5.homework;

public class DAOImpl implements DAO {

    Room[] roomDb = new Room[10];

    @Override
    public Room save(Room room) {
        for (int i = 0; i < roomDb.length; i++) {
            if (roomDb[i] == null) {
                roomDb[i] = room;
                System.out.println("The room " + room + " has been saved.");
            }
        }
        return null;
    }

    @Override
    public boolean delete(Room room) {
        for (int i = 0; i < roomDb.length; i++) {
            if (room != null && room.equals(roomDb[i])) {
                System.out.println("The room " + roomDb[i] + " has been deleted.");
            }
        }
        return false;
    }

    @Override
    public Room update(Room room) {
        for (int i = 0; i < roomDb.length; i++)
            if (roomDb[i] != null && roomDb[i].getId() == room.getId()) {
                roomDb[i] = room;
                System.out.println("The room with id " + room.getId() + "was updated.");
            }

        return room;
    }

    @Override
    public Room findByID(long id) {
        for (Room room : roomDb) {
            if (room != null && room.getId() == id) {
                return room;
            }
        }
        return null;
    }
}

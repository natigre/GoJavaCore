package module5.homework;

public class DAOImpl implements DAO {

    @Override
    public Room save(Room room) {
        System.out.println("The room " + room.toString()+ " has been saved.");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("The room " + room.toString() + " has been deleted.");
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println("The room " + room.toString() + "is updated.");
        return room;
    }

    @Override
    public Room findByID(Room room) {
        System.out.println("FindById for " + room.getId());
        return room;
    }
}

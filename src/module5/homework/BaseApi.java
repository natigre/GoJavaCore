package module5.homework;

public interface BaseApi {
    Room[] findRooms(int price, int persons, String city, String hotel);

    Room[] getAll();
}

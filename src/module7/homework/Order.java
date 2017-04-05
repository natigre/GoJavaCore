package module7.homework;


public class Order implements Comparable<Order> {
    private long id;
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIdintificator;
    private User user;

    public Order(long id, int price, Currency currency, String itemName, String shopIdentificator, User user) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdintificator = shopIdentificator;
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != order.id) return false;
        if (price != order.price) return false;
        if (currency != order.currency) return false;
        if (itemName != null ? !itemName.equals(order.itemName) : order.itemName != null) return false;
        if (shopIdintificator != null ? !shopIdintificator.equals(order.shopIdintificator) : order.shopIdintificator != null)
            return false;
        return user != null ? user.equals(order.user) : order.user == null;

    }

    @Override
    public int compareTo(Order o) {
        return o.getPrice() - this.price;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + price;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (itemName != null ? itemName.hashCode() : 0);
        result = 31 * result + (shopIdintificator != null ? shopIdintificator.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
//                "id=" + id +
                " price=" + price +
                ", currency=" + currency +
                ", itemName='" + itemName + '\'' +
                ", shopIdintificator='" + shopIdintificator + '\'' +
                ", user=" + user +
                '}';
    }

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getItemName() {
        return itemName;
    }

    public String getShopIdintificator() {
        return shopIdintificator;
    }

    public User getUser() {
        return user;
    }
}


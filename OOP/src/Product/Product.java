package Product;

public class Product {
    String name;
    int quantity;
    int price;

    public Product(String name, int quantity, int price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public long totalMoney() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return name + " - " + quantity + " - " + price + " - " + totalMoney();
    }
}

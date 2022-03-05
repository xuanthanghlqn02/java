package techmaster.product;

public class Product {
    private int id;
    private String name;
    private Category category;
    private int quatity;
    private long price;

    public Product() {
    }

    public Product(int id, String name, Category category, int quatity, long price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quatity = quatity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + category + " - " + quatity + " - " + price;
    }
}

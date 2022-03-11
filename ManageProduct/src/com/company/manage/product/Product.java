package com.company.manage.product;

public class Product {
    private int id;
    private String name;
    private Category category;
    private int quantity;
    private long price;

//    public Product() {
//    }

    public Product(int id, String name, Category category, int quantity, long price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + id + " - " +
                "Name: " + name + " - " +
                "Category: " + category + " - " +
                "Quantity: " + quantity + " - " +
                "Price: " + price;
    }
}

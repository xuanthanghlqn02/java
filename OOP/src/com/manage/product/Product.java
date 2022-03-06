package com.manage.product;

public class Product {
    private int id;
    private String name;
    private String type;
    private int quatity;
    private long price;

    public Product(int id, String name, String type, int quatity, long price) {
        this.id = id;
        this.name = name;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        return id + " - " + name + " - " + type + " - " + quatity + " - " + price;
    }
}

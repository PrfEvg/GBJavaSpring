package ru.gb.web.application;

public class Product {
    private int id;
    private String title;
    private float cost;

    public Product(int id, String title, float cost) {
        this.cost = cost;
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public float getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Product: " +
                "id = " + id +
                ", title = " + title +
                ", cost = " + cost +
                ".";
    }
}

package ru.gb.web.application;

public class Product {
    private int id;
    private String title;
    private double cost;

    public Product(int id, String title, int cost) {
        this.cost = cost;
        this.id = id;
        this.title = title;
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

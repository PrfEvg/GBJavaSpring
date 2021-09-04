package ru.gb.domain;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private int id;
    private LocalDate date;
    private float cost;
    private List<Product> productList;

    public Order(int id, LocalDate date, float cost, List<Product> productList) {
        this.id = id;
        this.date = date;
        this.cost = cost;
        this.productList = productList;
    }

    public Order() {
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public float getCost() {
        return cost;
    }

    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", cost=" + cost +
                ", productList=" + productList +
                '}';
    }

}
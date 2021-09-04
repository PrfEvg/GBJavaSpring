package ru.gb.repository;

import org.springframework.stereotype.Repository;
import ru.gb.domain.Order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class OrderRepository {
    private List<Order> orderList;


    public OrderRepository() {
        this.orderList = new ArrayList<>(
                List.of(
                        new Order(1, LocalDate.now(), 300.00F, Collections.emptyList())
                ));
    }

    public Optional<Order> findById(int id) {
        return orderList.stream().filter(p -> p.getId() == id).findFirst();
    }

    public List<Order> findAll() {
        return orderList;
    }

    public void add(Order order) {
        this.orderList.add(order);
    }

    public void remove(int id) {
        Order order = findById(id).orElseThrow();
        this.orderList.remove(order);
    }

    @Override
    public String toString() {
        return "OrderRepository{" +
                "orderList=" + orderList +
                '}';
    }
}

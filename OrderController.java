package ru.gb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.gb.domain.Order;
import ru.gb.repository.OrderRepository;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrderController {
    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Order findById(@PathVariable int id) {
        return orderRepository.findById(id).orElseThrow();
    }

    @RequestMapping(method = RequestMethod.POST)
    public List<Order> save(@RequestBody Order order) {
        orderRepository.add(order);
        return orderRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id) {
        orderRepository.remove(id);
    }
}

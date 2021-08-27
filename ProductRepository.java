package ru.gb.web.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepository {
    private List<Product> ListOfProducts = new ArrayList<Product>();;

    public Optional<Product> findById(int id) {
        return ListOfProducts.stream().filter(p -> p.getId() == id).findFirst();
    }

    public void removeById(int id) {
        ListOfProducts.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .ifPresent(ListOfProducts::remove);
    }

    public void findAll() {
        System.out.println(ListOfProducts);
    }

    public void productAdd(Product product) {
        ListOfProducts.add(product);
    }

    public void deleteAll() {
        ListOfProducts.clear();
    }


    @Override
    public String toString() {
        return "ProductRepository{" +
                "products=" + ListOfProducts +
                '}';
    }
}

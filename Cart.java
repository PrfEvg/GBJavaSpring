package ru.gb.web.application;

import java.util.ArrayList;
import java.util.*;

public class Cart {
    private ProductRepository repository;
    private List<Product> productsOfCart;

    public Cart(ProductRepository repository) {
        this.repository = repository;
        this.productsOfCart = new ArrayList<>();
    }

    public void add(int id) {
        repository.findById(id).ifPresent(productsOfCart::add);
    }

    public void remove(int id) {
        productsOfCart.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .ifPresent(productsOfCart::remove);
    }

    public void printCart() {
        System.out.println(productsOfCart);
    }

    public void UseCart() {
        boolean flagExitMenu = true;
        Scanner console = new Scanner(System.in);
        Scanner console2 = new Scanner(System.in);


        while (flagExitMenu) {
            System.out.println(
                            "1 - добавить товары в ProductRepository;\n" +
                            "2 - поиск товара в ProductRepository по ID;\n" +
                            "3 - удаление товара в ProductRepository по ID;\n" +
                            "4 - вывод всех товаров из ProductRepository;\n" +
                            "5 - добавить из ProductRepository в Cart;\n" +
                            "6 - удалить из Cart по id;\n" +
                            "7 - показать все товары в корзине;\n" +
                            "8 - выход и закрытие корзины;");
            int input = console.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Введите id");
                    int id = console.nextInt();

                    System.out.println("Введите наименование");
                    String name = console2.nextLine();

                    System.out.println("Введите стоимость");
                    int cost = console.nextInt();
                    repository.productAdd(new Product(id, name, cost));
                    break;
                case 2:
                    int id4 = console.nextInt();
                    System.out.println(repository.findById(id4));
                case 3:
                    System.out.println("Введите id");
                    int id1 = console.nextInt();
                    repository.removeById(id1);
                    break;
                case 4:
                    repository.findAll();
                    break;
                case 5:
                    System.out.println("Введите id");
                    int id2 = console.nextInt();
                    add(id2);
                    break;
                case 6:
                    System.out.println("Введите id");
                    int id3 = console.nextInt();
                    remove(id3);
                    break;
                case 7:
                    printCart();
                    break;
                case 8:
                    flagExitMenu = false;
                    break;

            }
        }
    }
}

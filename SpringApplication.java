package ru.gb.web.application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(CartConfiguration.class);
        Cart cart = context1.getBean(Cart.class);
        cart.UseCart();
        Cart cart2 = context1.getBean(Cart.class);
        cart2.UseCart();
    }
}

package ru.gb.web.application;

import java.io.*;
import java.util.List;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "products", value = "/products")
public class ServletProduct extends HttpServlet {

    @Override
    public void init() {
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Product> product = List.of(
                new Product(1, "coat", 1),
                new Product(2, "hat", 2),
                new Product(3, "shirt", 3),
                new Product(4, "skirt", 4),
                new Product(5, "jeans", 5),
                new Product(6, "jacket", 6),
                new Product(7, "belt", 7),
                new Product(8, "shoes", 81),
                new Product(9, "sweater", 9),
                new Product(10, "dress", 10)
        );
        response.setContentType("text/html");
        for (int i = 0; i < 10; i++) {
            PrintWriter out = response.getWriter().printf("<h1>"+ product.get(i) +"</h1>");
        }
    }

    @Override
    public void destroy() {
    }
}
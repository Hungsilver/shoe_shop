package com.example.project_shoe_shop.controller;

import com.example.project_shoe_shop.test.ProductTest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping({"/"})
public class HomeController {
    private static final List<ProductTest> LIST_PRODUCTS = new ArrayList<>();

    static {
        LIST_PRODUCTS.add(new ProductTest(1L, "sp001", 45, new BigDecimal(230000), "dep", "anh1.jpg", 1));
        LIST_PRODUCTS.add(new ProductTest(2L, "sp002", 45, new BigDecimal(230000), "dep", "anh2.jpg", 1));
        LIST_PRODUCTS.add(new ProductTest(3L, "sp003", 45, new BigDecimal(230000), "dep", "anh3.jpg", 1));
    }

    @GetMapping
    public String home(Model model) {
        model.addAttribute("CTGiays", LIST_PRODUCTS);
        LIST_PRODUCTS.forEach(System.out::println);
        return "home/home_page";
    }

}

package com.zimrancis.thymeleafajax.controller;


import com.zimrancis.thymeleafajax.model.Order;
import com.zimrancis.thymeleafajax.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    OrderService service;

    @RequestMapping("/order")
    public String getHomePage(Model model) {
        List<Order> orderList = service.getOrderList();
        model.addAttribute("orders", orderList);
        return "Homepage";
    }

    @GetMapping("/autoRefresh")
    public String autoRefreshPage() {
        return "AutoRefresh";
    }
}

package com.zimrancis.thymeleafajax.controller;


import com.zimrancis.thymeleafajax.model.Order;
import com.zimrancis.thymeleafajax.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeRestController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/orderDetails")
    public List<Order> getHomePage(Model model) {
        List<Order> orderList = orderService.getOrderList();
        model.addAttribute("orderList", orderList);
        return orderList;
    }

}

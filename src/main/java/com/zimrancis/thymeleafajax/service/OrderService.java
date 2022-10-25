package com.zimrancis.thymeleafajax.service;

import com.zimrancis.thymeleafajax.model.Order;
import com.zimrancis.thymeleafajax.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository repo;

    public List<Order> getOrderList() {
        List<Order> orderList = repo.findTop10ByOrderByOrderIdDesc();
        return orderList;
    }
}
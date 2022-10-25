package com.zimrancis.thymeleafajax.repository;

import com.zimrancis.thymeleafajax.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Date> {
    public List<Order> findAllByOrderByOrderIdAsc();
    public List<Order> findTop10ByOrderByOrderIdDesc();


}

package com.shopping.order.controller;

import com.shopping.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private static final Logger LOG = LoggerFactory.getLogger(OrderController.class);
    private AtomicLong id = new AtomicLong();

    @PostMapping("/createOrder")
    public Order create(@RequestBody Order order) {

        LOG.info("Sent: {}", order);
        return order;
    }

    @GetMapping("/getByOrderId")
    public Order getByOrderId(@RequestParam String orderId) {
        Order r = new Order();
        LOG.info("Sent: {}", r);
        return r;
    }
}

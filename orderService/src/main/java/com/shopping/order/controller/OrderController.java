package com.shopping.order.controller;

import com.shopping.model.Order;
import com.shopping.order.exception.OrderNotFoundExcpetion;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @Operation(summary = "Get a Order by its id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the Order",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Order.class)) }),
            @ApiResponse(responseCode = "404", description = "Order not found",
                    content = @Content) })
    @GetMapping("/getByOrderId")
    public ResponseEntity<Order> getByOrderId(@RequestParam Long orderId) throws OrderNotFoundExcpetion {
        if(orderId>30){
           throw new OrderNotFoundExcpetion("Order ID not found");
        }
        else{
        Order r = new Order();
       
        r.setCustomerId(1L);
        r.setPrice(10000);
        r.setStatus("Order delivered");
        LOG.info("Sent: {}", r);
            return new ResponseEntity<>(r, HttpStatus.OK);
        }
    }
}

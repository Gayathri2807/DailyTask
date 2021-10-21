package com.practice.task.DailyTask.Controller;

import com.practice.task.DailyTask.Model.Order;
import com.practice.task.DailyTask.Model.OrderInput;
import com.practice.task.DailyTask.Model.OrderOutput;
import com.practice.task.DailyTask.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class OrderController {

    @Autowired
    public OrderService orderService;

    @PostMapping("/getOrderStats")
    public OrderOutput getStatus(@RequestBody OrderInput orderInput) {
        orderService.getOrderList();
        return orderService.getOrderStats(orderInput.getStatName());

    }
}

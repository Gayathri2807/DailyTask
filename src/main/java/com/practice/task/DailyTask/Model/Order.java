package com.practice.task.DailyTask.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Order {
    private String orderId;
    private String productId;
    private String date;
    private double Quantity;
}

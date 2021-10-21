package com.practice.task.DailyTask.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class OrderList {
    private String orderId;
    private String date;
    private double quantity;
}

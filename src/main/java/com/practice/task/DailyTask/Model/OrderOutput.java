package com.practice.task.DailyTask.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class OrderOutput {
    private String productId;
    private List<OrderList> orderList;
}

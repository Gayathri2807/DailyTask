package com.practice.task.DailyTask.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class OutputInventory {
    private String productId;
    private String prodName;
    private double availQty;
}

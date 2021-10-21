package com.practice.task.DailyTask.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class OutputProduct {
    private String productId;
    private String prodName;
    private double availQty;
}

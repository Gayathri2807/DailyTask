package com.practice.task.DailyTask.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class SupplyOutput {
    private String productId;
    private String TimeStamp;
    private Double quantity;
    private String status;
}

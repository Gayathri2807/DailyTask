package com.practice.task.DailyTask.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Supply {
    private String productId;
    private String TimeStamp;
    private Double quantity;
}

package com.practice.task.DailyTask.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data
public class StoreCapacity {
    private String storeNo;
    private String productId;
    private String date;
    private double noOfOrdersAccepted;
}

package com.practice.task.DailyTask.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data
public class StoreInput {
    private String storeNo;
    private String productId;
    private double reqQty;
    private String reqDate;
}


package com.practice.task.DailyTask.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Product {
    private String productId;
    private String prodName;
    private String UnitOfMeasure;
    private double availQty;
    public String availDate;



}

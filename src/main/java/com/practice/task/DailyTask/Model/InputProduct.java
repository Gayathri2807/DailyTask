package com.practice.task.DailyTask.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data
public class InputProduct {
    private String productId;
    private String prodName;
    private String availDate;

}

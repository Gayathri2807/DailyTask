package com.practice.task.DailyTask.Service;

import com.practice.task.DailyTask.Model.InputProduct;
import com.practice.task.DailyTask.Model.Product;

import java.util.List;

public interface ProductList {
    public Double getInputInventory(InputProduct inputProduct);

    public List<Product> getProductList();
    //public String getDate(String date);

}

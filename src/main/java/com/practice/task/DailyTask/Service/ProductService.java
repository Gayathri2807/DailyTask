package com.practice.task.DailyTask.Service;

import com.practice.task.DailyTask.Model.InputProduct;
import com.practice.task.DailyTask.Model.Product;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ProductService implements  ProductList {

    private static List<Product> productList = new ArrayList<Product>();
   private static List<InputProduct> inputProductList = new ArrayList<InputProduct>();

    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");

    @Override
    public List<Product> getProductList() {
      Date avldate1, avldate2, avldate3;
        try {
            avldate1 = formatter.parse("2021-03-19");
            avldate2 = formatter.parse("2021-03-21");
            avldate3 = formatter.parse("2021-03-29");


            productList.add(new Product("Prod1", "Shirt", "EACH", 10, formatter.format(avldate1)));
            productList.add(new Product("Prod1", "Trousers", "EACH", 20,formatter.format(avldate2)));
            productList.add(new Product("Prod1", "Trousers", "EACH", 20,formatter.format(avldate3)));

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return productList;
    }

    @Override
    public Double getInputInventory(InputProduct inputProduct) {
        LocalDate Date1 = LocalDate.parse(inputProduct.getAvailDate());
        LocalDate Date2 = Date1.plusDays(10);
        double quantity = 0;
        if (Date1.isAfter(LocalDate.of(2021, 03, 18)) && Date1.isBefore(LocalDate.of(2021, 03, 30))) {
            for (Product i : productList) {
                LocalDate Date3 = LocalDate.parse(i.getAvailDate());
                if (Date3.isAfter(Date1.minusDays(1)) && Date3.isBefore(Date2.plusDays(1))) {
                    quantity = quantity + i.getAvailQty();
                }
            }
            return quantity;
        } else
            return quantity;
    }
}

    /*public String getDate(String date){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");

        Date avldate1;
        try {
            avldate1 = formatter.parse(date);
        }catch (ParseException e){
            e.printStackTrace();
        }
        //System.out.println("get date from user "+date);
        return getDate(date);
*/




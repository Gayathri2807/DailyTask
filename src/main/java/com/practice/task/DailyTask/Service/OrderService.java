package com.practice.task.DailyTask.Service;

import com.practice.task.DailyTask.Model.Order;
import com.practice.task.DailyTask.Model.OrderList;
import com.practice.task.DailyTask.Model.OrderOutput;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
@Service
public class OrderService {
    private static List<Order> orderList = new ArrayList<Order>();

    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");

    public List<Order> getOrderList() {
        Date date1, date2, date3, date4, date5;
        try {
            date1 = formatter.parse("2021-03-16");
            date2 = formatter.parse("2021-03-19");
            date3 = formatter.parse("2021-03-16");
            date4 = formatter.parse("2021-03-20");
            date5 = formatter.parse("2021-03-16");

            orderList.add(new Order("Order1", "Product1", formatter.format(date1), 10));
            orderList.add(new Order("Order2", "Product2", formatter.format(date2), 5));
            orderList.add(new Order("Order3", "Product1", formatter.format(date3), 30));
            orderList.add(new Order("Order4", "Product4", formatter.format(date4), 20));
            orderList.add(new Order("Order5", "Product2", formatter.format(date5), 20));


        } catch (ParseException e) {
            e.printStackTrace();
        }
        return orderList;
    }

    public OrderOutput getOrderStats(String status) {
/***
 * Storing the sum of quantities based on the productId respectively
 */
        Double quantity1 = 0.0, quantity2 = 0.0, quantity3 = 0.0;
        for (Order o : OrderService.orderList) {
            if (o.getProductId().equals("Product1")) {
                quantity1 += o.getQuantity();
            } else if (o.getProductId().equals("Product2")) {
                quantity2 += o.getQuantity();
            } else if (o.getProductId().equals("Product4")) {
                quantity3 += o.getQuantity();
            }
        }
/***
 * Finding the maximum and minimum among the quantities obtained
 */
        List<Double> l = Arrays.asList(quantity1, quantity2, quantity3);
        Double maximum = 0.0;
        Double minimum = 0.0;
        if (status.equals("MAX_SALE")) {
            maximum = l.stream().max(Double::compare).get();
        } else {
            minimum = l.stream().min(Double::compare).get();
        }
/**
 *  checking which quantity has maximum or minimum value
 *  and then check which ProductID has maximum or minimum value
 *  and then pass it to output
 */

            OrderOutput orderOutput = null;
            List<OrderList> orderCombined = new ArrayList<>();
            if (maximum.equals(quantity1)) {
                for(Order o:orderList) {
                    if(o.getProductId().equalsIgnoreCase("Product1")) {
                        OrderList collectOrderList = new OrderList(o.getOrderId(), o.getDate(), o.getQuantity());
                        orderCombined.add(collectOrderList);
                        orderOutput = new OrderOutput("Product1", orderCombined);
                    }
                }
            }

            if (minimum.equals(quantity3)) {
                for(Order o:orderList) {
                    if(o.getProductId().equalsIgnoreCase("Product4")) {
                        OrderList collectOrderList = new OrderList(o.getOrderId(), o.getDate(), o.getQuantity());
                        orderCombined.add(collectOrderList);
                        orderOutput = new OrderOutput("Product4", orderCombined);
                    }
                }
            }
            return orderOutput;
        }
    }




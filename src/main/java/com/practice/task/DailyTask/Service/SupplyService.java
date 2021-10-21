package com.practice.task.DailyTask.Service;

import com.practice.task.DailyTask.Model.Supply;
import com.practice.task.DailyTask.Model.SupplyOutput;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SupplyService {

    private static List<Supply> supplyList = new ArrayList<>();

    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

    public List<Supply> supplyList() throws ParseException {

        Date date1 = formatter.parse("2021-03-16T08:53:48.616Z");
        Date date2 = formatter.parse("2021-03-16T08:59:48.616Z");
        Date date3 = formatter.parse("2021-03-16T09:10:48.616Z");
        Date date4 = formatter.parse("2021-03-16T09:10:48.616Z");

        supplyList.add(new Supply("Product1",formatter.format(date1),10.0));
        supplyList.add(new Supply("Product2",formatter.format(date2),5.0));
        supplyList.add(new Supply("Product3",formatter.format(date3),30.0));
        supplyList.add(new Supply("Product4",formatter.format(date4),20.0));

        return supplyList;
    }


    public SupplyOutput updateSupply(Supply supply) {

        Double quantity = supplyList.stream().filter(s -> s.getProductId().equals((supply.getProductId())))
                .filter(s -> s.getTimeStamp().compareTo(supply.getTimeStamp()) < 0 )
                .mapToDouble(s -> s.getQuantity()).sum();

        SupplyOutput supplyOutput = null;
        if (quantity > 0) {
            quantity = quantity + supply.getQuantity();
            supplyOutput = new SupplyOutput(supply.getProductId(), supply.getTimeStamp(), quantity, "Updated");
        }
        else
            supplyOutput = new SupplyOutput(supply.getProductId(), supply.getTimeStamp(), supply.getQuantity(), "Out of sync update");

        return supplyOutput;
    }
}



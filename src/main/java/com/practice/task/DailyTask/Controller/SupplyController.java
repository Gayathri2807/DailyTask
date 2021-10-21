package com.practice.task.DailyTask.Controller;

import com.practice.task.DailyTask.Model.*;
import com.practice.task.DailyTask.Service.SupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
public class SupplyController {

    @Autowired
    private SupplyService supplyService;

    @GetMapping("/getSupplyList")
    public List<Supply> getSupplyList() throws ParseException {
        return supplyService.supplyList();
    }

    @PostMapping("/updateSupply")
    public SupplyOutput getStaus(@RequestBody Supply supply) throws ParseException {
        supplyService.supplyList();
        return supplyService.updateSupply(supply);
    }


}

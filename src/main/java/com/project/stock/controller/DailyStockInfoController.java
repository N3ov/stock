package com.project.stock.controller;

import com.project.stock.entity.DailyStockInfoEntity;
import com.project.stock.service.DailyStockInfoService;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/stock")
public class DailyStockInfoController {


    private final DailyStockInfoService dailyStockInfoService;

    public DailyStockInfoController(DailyStockInfoService dailyStockInfoService) {
        this.dailyStockInfoService = dailyStockInfoService;
    }

    @GetMapping("/allInfo")
    public List<DailyStockInfoEntity> getAllInfo(){
        return dailyStockInfoService.getAllInfo();
    }

    @GetMapping(value = "/twse")
    public JSONObject getJson() throws Exception {
        String url = "https://www.twse.com.tw/exchangeReport/STOCK_DAY_ALL?response=json";
        return dailyStockInfoService.twseStock(url);
    }

    @GetMapping(value = "/info/{stockNumber}")
    public Optional<DailyStockInfoEntity> findByStockNumber(@PathVariable String stockNumber){
        return dailyStockInfoService.findByStockNumber(stockNumber);
    }
}

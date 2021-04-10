package com.project.stock.controller;

import com.project.stock.entity.DailyStockInfoEntity;
import com.project.stock.service.DailyStockInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.util.List;


@RestController
@RequestMapping("/stock")
public class DailyStockInfoController {

    private final RestTemplate restTemplate;

    final DailyStockInfoService dailyStockInfoService;

    public DailyStockInfoController(DailyStockInfoService dailyStockInfoService, RestTemplate restTemplate) {
        this.dailyStockInfoService = dailyStockInfoService;
        this.restTemplate = restTemplate;
    }

    @GetMapping("/allInfo")
    public List<DailyStockInfoEntity> getAllInfo() {
        return dailyStockInfoService.getAllInfo();
    }

    @GetMapping("/twse")
    public Object getJson() {
        String url = "https://www.twse.com.tw/exchangeReport/STOCK_DAY_ALL?response=json";
        ResponseEntity<String> results = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
        return results.getBody();
    }
}

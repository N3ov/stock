package com.project.stock.service;

import com.project.stock.entity.DailyStockInfoEntity;
import com.project.stock.repository.DailyStockInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DailyStockInfoService {

    final DailyStockInfoRepository dailyStockInfoRepository;

    public DailyStockInfoService(DailyStockInfoRepository dailyStockInfoRepository) {
        this.dailyStockInfoRepository = dailyStockInfoRepository;
    }

    public List<DailyStockInfoEntity> getAllInfo() {
        return dailyStockInfoRepository.findAll();
    }
}

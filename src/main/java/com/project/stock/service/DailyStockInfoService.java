package com.project.stock.service;

import com.project.stock.entity.DailyStockInfoEntity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;
import java.util.Optional;

public interface DailyStockInfoService {

    List<DailyStockInfoEntity> getAllInfo();

    JSONObject twseStock(String url) throws JSONException;

    void saveDataToEntity(JSONArray dataList, int i) throws JSONException;

    Optional<DailyStockInfoEntity> findByStockNumber(String number);
}

package com.project.stock.service.impl;

import com.project.stock.entity.DailyStockInfoEntity;
import com.project.stock.repository.DailyStockInfoRepository;
import com.project.stock.service.DailyStockInfoService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class DailyStockInfoServiceImpl implements DailyStockInfoService {

    private final DailyStockInfoRepository dailyStockInfoRepository;

    private final RestTemplate restTemplate;

    public DailyStockInfoServiceImpl(DailyStockInfoRepository dailyStockInfoRepository, RestTemplate restTemplate) {
        this.dailyStockInfoRepository = dailyStockInfoRepository;
        this.restTemplate = restTemplate;
    }

    @Override
    public List<DailyStockInfoEntity> getAllInfo() {
        return dailyStockInfoRepository.findAll();
    }

    @Override
    public JSONObject twseStock(String url) throws JSONException {
        String result = restTemplate.getForEntity(url, String.class).getBody();

        JSONObject json = new JSONObject(result);
        JSONArray dataList = json.getJSONArray("data");
        for(int i=0; i<dataList.length(); i++) {
            saveDataToEntity(dataList, i);
            System.out.println("save success");
        }
        System.out.println("dataList" + dataList);
        return json;
    }

    @Override
    public Optional<DailyStockInfoEntity> findByStockNumber(String number) {
        return dailyStockInfoRepository.findByStockNumber(number);
    }

    private void saveDataToEntity(JSONArray dataList, int i) throws JSONException {
        JSONArray obj = dataList.getJSONArray(i);
        DailyStockInfoEntity data = new DailyStockInfoEntity();
        data.setStockNumber((String) obj.get(0));
        data.setStockName((String) obj.get(1));
        data.setStockShares((String) obj.get(2));
        data.setStockAmount((String) obj.get(3));
        data.setOpeningPrice((String) obj.get(4));
        data.setHighestPrice((String) obj.get(5));
        data.setLowestPrice((String) obj.get(6));
        data.setClosingPrice((String) obj.get(7));
        data.setPriceDifference((String) obj.get(8));
        data.setNumberOfTransactions((String) obj.get(9));
        dailyStockInfoRepository.save(data);
    }


}

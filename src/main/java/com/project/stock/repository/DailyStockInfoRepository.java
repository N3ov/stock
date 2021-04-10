package com.project.stock.repository;

import com.project.stock.entity.DailyStockInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DailyStockInfoRepository extends JpaRepository<DailyStockInfoEntity, Integer> {

    List<DailyStockInfoEntity> findAll();
}

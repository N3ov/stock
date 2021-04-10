package com.project.stock.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "daily_deal_info", schema = "stock", catalog = "postgres")
public class DailyStockInfoEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String stockNumber;

    private String stockName;

    private int stockShares;
    private float stockAmount;
    private float openingPrice;
    private float highestPrice;
    private float lowestPrice;
    private float closingPrice;
    private float priceDifference;
    private int numberOfTransactions;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(String stockNumber) {
        this.stockNumber = stockNumber;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getStockShares() {
        return stockShares;
    }

    public void setStockShares(int stockShares) {
        this.stockShares = stockShares;
    }

    public float getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(float stockAmount) {
        this.stockAmount = stockAmount;
    }

    public float getOpeningPrice() {
        return openingPrice;
    }

    public void setOpeningPrice(float openingPrice) {
        this.openingPrice = openingPrice;
    }

    public float getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(float highestPrice) {
        this.highestPrice = highestPrice;
    }

    public float getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(float lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public float getClosingPrice() {
        return closingPrice;
    }

    public void setClosingPrice(float closingPrice) {
        this.closingPrice = closingPrice;
    }

    public float getPriceDifference() {
        return priceDifference;
    }

    public void setPriceDifference(float priceDifference) {
        this.priceDifference = priceDifference;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(int numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    @Override
    public String toString() {
        return "DailyStockInfoEntity{" +
                "id=" + id +
                ", stockNumber='" + stockNumber + '\'' +
                ", stockName='" + stockName + '\'' +
                ", stockShares=" + stockShares +
                ", stockAmount=" + stockAmount +
                ", openingPrice=" + openingPrice +
                ", highestPrice=" + highestPrice +
                ", lowestPrice=" + lowestPrice +
                ", closingPrice=" + closingPrice +
                ", priceDifference=" + priceDifference +
                ", numberOfTransactions=" + numberOfTransactions +
                '}';
    }
}

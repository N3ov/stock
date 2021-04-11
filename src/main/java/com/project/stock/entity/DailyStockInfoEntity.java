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

    private String stockShares;
    private String stockAmount;
    private String openingPrice;
    private String highestPrice;
    private String lowestPrice;
    private String closingPrice;
    private String priceDifference;
    private String numberOfTransactions;

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

    public String getStockShares() {
        return stockShares;
    }

    public void setStockShares(String stockShares) {
        this.stockShares = stockShares;
    }

    public String getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(String stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getOpeningPrice() {
        return openingPrice;
    }

    public void setOpeningPrice(String openingPrice) {
        this.openingPrice = openingPrice;
    }

    public String getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(String highestPrice) {
        this.highestPrice = highestPrice;
    }

    public String getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(String lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public String getClosingPrice() {
        return closingPrice;
    }

    public void setClosingPrice(String closingPrice) {
        this.closingPrice = closingPrice;
    }

    public String getPriceDifference() {
        return priceDifference;
    }

    public void setPriceDifference(String priceDifference) {
        this.priceDifference = priceDifference;
    }

    public String getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(String numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }
}

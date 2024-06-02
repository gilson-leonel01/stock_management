package com.uno.www.stockmanagement.model.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Sale {
    private Long id;
    private Client client;
    private User user;
    private BigDecimal totalSale;
    private BigDecimal amountToPay;
    private BigDecimal discount;
    private BigDecimal change;
    private LocalDateTime lastUpdate;
    private LocalDateTime dateAndTimeOfCreation;

    public Sale(Long id, Client client, BigDecimal totalSale, User user, BigDecimal amountToPay, BigDecimal discount, BigDecimal change, LocalDateTime lastUpdate, LocalDateTime dateAndTimeOfCreation) {
        this.id = id;
        this.client = client;
        this.totalSale = totalSale;
        this.user = user;
        this.amountToPay = amountToPay;
        this.discount = discount;
        this.change = change;
        this.lastUpdate = lastUpdate;
        this.dateAndTimeOfCreation = dateAndTimeOfCreation;
    }

    public Sale() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BigDecimal getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(BigDecimal totalSale) {
        this.totalSale = totalSale;
    }

    public BigDecimal getAmountToPay() {
        return amountToPay;
    }

    public void setAmountToPay(BigDecimal amountToPay) {
        this.amountToPay = amountToPay;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getChange() {
        return change;
    }

    public void setChange(BigDecimal change) {
        this.change = change;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public LocalDateTime getDateAndTimeOfCreation() {
        return dateAndTimeOfCreation;
    }

    public void setDateAndTimeOfCreation(LocalDateTime dateAndTimeOfCreation) {
        this.dateAndTimeOfCreation = dateAndTimeOfCreation;
    }
}

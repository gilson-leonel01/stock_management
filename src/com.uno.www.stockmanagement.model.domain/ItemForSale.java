package com.uno.www.stockmanagement.model.domain;

import java.math.BigDecimal;

public class ItemForSale {
    private Sale sale;
    private Product product;
    private Integer quantity;
    private BigDecimal total;
    private BigDecimal discount;

    public ItemForSale() {
    }

    public ItemForSale(Sale sale, Product product, Integer quantity, BigDecimal total, BigDecimal discount) {
        this.sale = sale;
        this.product = product;
        this.quantity = quantity;
        this.total = total;
        this.discount = discount;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }
}

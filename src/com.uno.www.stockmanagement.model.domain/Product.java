package com.uno.www.stockmanagement.model.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Product {
    private long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer quantity;
    private User user;
    private Category category;
    private LocalDateTime dateAndTimeOfCreation;

    public Product() {
    }

    public Product(long id, String name, String description, BigDecimal price, Integer quantity, User user, Category category, LocalDateTime dateAndTimeOfCreation) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.user = user;
        this.category = category;
        this.dateAndTimeOfCreation = dateAndTimeOfCreation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDateTime getDateAndTimeOfCreation() {
        return dateAndTimeOfCreation;
    }

    public void setDateAndTimeOfCreation(LocalDateTime dateAndTimeOfCreation) {
        this.dateAndTimeOfCreation = dateAndTimeOfCreation;
    }
}

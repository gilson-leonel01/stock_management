package com.uno.www.stockmanagement.model.domain;

import java.time.LocalDateTime;
import java.util.Objects;

public class User {
    private Long id;
    private String name;
    private String user;
    private Profile profile;
    private boolean status;
    private LocalDateTime lastLogin;
    private LocalDateTime dateAndTimeOfCreation;

    public User() {
    }

    public User(Long id, String name, String user, Profile profile, boolean status, LocalDateTime lastLogin, LocalDateTime dateAndTimeOfCreation) {
        this.id = id;
        this.name = name;
        this.user = user;
        this.profile = profile;
        this.status = true;
        this.lastLogin = lastLogin;
        this.dateAndTimeOfCreation = dateAndTimeOfCreation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    public LocalDateTime getDateAndTimeOfCreation() {
        return dateAndTimeOfCreation;
    }

    public void setDateAndTimeOfCreation(LocalDateTime dateAndTimeOfCreation) {
        this.dateAndTimeOfCreation = dateAndTimeOfCreation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public void reset(){
        this.status = true;
    }

    public void switchStatus(){
        this.status = !this.status;
    }
}

package com.wsw.dto;

import org.hibernate.validator.constraints.NotBlank;

import java.util.Date;

public class User {
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;
    private String id;
    private Date birthday;

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}

package com.github.startzyp.swagger2.swagger2.model;

import io.swagger.annotations.ApiModelProperty;



public class User {

    private Long Id;

    @ApiModelProperty("用户名")
    private String userName;

    public User(Long id, String userName) {
        Id = id;
        this.userName = userName;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
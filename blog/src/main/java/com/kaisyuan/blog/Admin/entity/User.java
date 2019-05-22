package com.kaisyuan.blog.Admin.entity;

public class User {

    /**
     * 账号id
     */
    private String id;

    /**
     * 账号名称
     */
    private String username;

    /**
     * 账号密码
     */
    private String password;

    /**
     * 账号状态
     */
    private Integer status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

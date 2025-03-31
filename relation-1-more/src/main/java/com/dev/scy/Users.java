package com.dev.scy;

import java.util.List;

public class Users {
    private int id;
    private String username;
    private String address;
    private List<Orders> ordersList;

    @Override
    public String toString() {
        return "User [ id：" + id + "，用户名：" + username + "，地址：" 
                + address + "，用户关联的订单：" + ordersList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }
}

package com.scy.pojo;

import java.util.List;

public class User {
    private String username;
    private String password;
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<String> addressList) {
        this.addressList = addressList;
    }

    private Order order;
    private List<Order> orders;
    private List<String> addressList;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orderList) {
        this.orders = orderList;
    }

    public List<String> getAddress() {
        return addressList;
    }

    public void setAddress(List<String> addressList) {
        this.addressList = addressList;
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

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}

package com.dev.scy;

import java.util.List;

public class Product {
    private int id;
    private String name;
    private double price;
    private List<Orders> orders;

    @Override
    public String toString() {
        return "Product [id：" + id + "，产品名称：" + name + "售价：" + price + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }
}

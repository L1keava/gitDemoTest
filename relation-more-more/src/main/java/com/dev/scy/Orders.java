package com.dev.scy;

import java.util.List;

public class Orders {
    private int id;
    private String number;
    private List<Product> productList;

    @Override
    public String toString() {
        return "Orders id：" + id + "，订单编号：" + number + productList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

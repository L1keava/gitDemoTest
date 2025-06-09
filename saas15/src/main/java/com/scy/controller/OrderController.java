package com.scy.controller;

import com.scy.pojo.Order;
import com.scy.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class OrderController {
    @RequestMapping("/showOrders")
    public void showOrders(User user) {
        List<Order> orders = user.getOrders();
        List<String> addressList = user.getAddress();
        System.out.println("订单：");
        for (int i = 0;i < orders.size() ; i++ ) {
            Order order = orders.get(i);
            String address = addressList.get(i);
            System.out.println("订单Id:" + order.getOrderId());
            System.out.println("订单配送地址：" + address);
        }
    }
}

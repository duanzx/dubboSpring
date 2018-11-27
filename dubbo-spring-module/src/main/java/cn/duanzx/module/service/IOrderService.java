package cn.duanzx.module.service;

import cn.duanzx.module.bean.Order;

import java.util.List;

public interface IOrderService {

    public Order findOrderByOrderId(String orderId);

    public List<Order> findOrderList();
}

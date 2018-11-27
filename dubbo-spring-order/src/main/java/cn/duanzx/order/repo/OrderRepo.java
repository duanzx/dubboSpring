package cn.duanzx.order.repo;

import cn.duanzx.module.bean.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class OrderRepo {
    private static final List<Order> orderList;

    static {
        orderList = new ArrayList<>();
        for (int x = 1; x < 5; x++) {
            Order order = new Order();
            order.setOrderId(String.format("O-%d", x));
            order.setUserAddress(String.format("测试的地址-%d", x));
            order.setUserName(String.format("测试的用户名称-%d", x));
            orderList.add(order);
        }
    }

    public Order findOrderByOrderId(String orderId) {
        List<Order> list = orderList.stream().filter(order -> {
            return order.getOrderId().equalsIgnoreCase(orderId);
        }).collect(Collectors.toList());
        return list.isEmpty() ? null : list.get(0);
    }

    public List<Order> findOrderList() {
        return orderList;
    }
}

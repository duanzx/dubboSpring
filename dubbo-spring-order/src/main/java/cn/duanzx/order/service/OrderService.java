package cn.duanzx.order.service;

import cn.duanzx.module.bean.Order;
import cn.duanzx.module.service.IOrderService;
import cn.duanzx.order.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService {
    @Autowired
    private OrderRepo orderRepo;

    @Override
    public Order findOrderByOrderId(String orderId) {
        return orderRepo.findOrderByOrderId(orderId);
    }

    @Override
    public List<Order> findOrderList() {
        return orderRepo.findOrderList();
    }
}

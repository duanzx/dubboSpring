package cn.duanzx.order.service;

import cn.duanzx.module.bean.Order;
import cn.duanzx.module.service.IOrderService;
import cn.duanzx.order.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

//@Service(interfaceClass = IOrderService.class, version = "1.0.0")
@Component
public class OrderOneService implements IOrderService {
    @Autowired
    private OrderRepo orderRepo;

    @Override
    public Order findOrderByOrderId(String orderId) {
        return orderRepo.findOrderByOrderId(orderId);
    }

    @Override
    public List<Order> findOrderList() {
        return orderRepo.findOrderList().subList(0, 2);
    }
}

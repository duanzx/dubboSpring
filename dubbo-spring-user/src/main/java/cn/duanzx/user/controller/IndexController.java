package cn.duanzx.user.controller;

import cn.duanzx.module.service.IOrderService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Reference(version = "1.0.0")
    private IOrderService orderService;

    @GetMapping("/")
    public String showIndex(Model model) {
        model.addAttribute("orderList", orderService.findOrderList());
        return "Main_Index";
    }

}

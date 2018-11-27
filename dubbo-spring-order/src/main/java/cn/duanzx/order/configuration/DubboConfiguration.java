package cn.duanzx.order.configuration;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDubboConfig
@DubboComponentScan(basePackages = "cn.duanzx.user.controller")
public class DubboConfiguration {
}

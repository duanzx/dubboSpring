package cn.duanzx.user.configuration;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDubboConfig
@DubboComponentScan(basePackages = "cn.duanzx.order.service")
public class DubboConfiguration {
}

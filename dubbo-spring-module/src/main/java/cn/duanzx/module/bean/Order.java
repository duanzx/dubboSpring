package cn.duanzx.module.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class Order implements Serializable {
    private static final long serialVersionUID = 695006778545846789L;
    private String orderId;
    private String userName;
    private String userAddress;
}

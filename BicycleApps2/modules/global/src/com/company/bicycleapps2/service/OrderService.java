package com.company.bicycleapps2.service;


import com.company.bicycleapps2.entity.Order;

import java.math.BigDecimal;

public interface OrderService {
    String NAME = "bicycleapps2_OrderService";
    BigDecimal calculateAmount(Order order);
}
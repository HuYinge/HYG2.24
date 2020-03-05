package io.hyg.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.hyg.jcartstoreback.dto.in.OrderCheckoutInDTO;
import io.hyg.jcartstoreback.dto.out.OrderShowOutDTO;
import io.hyg.jcartstoreback.po.Order;

public interface OrderService {

    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO,
                  Integer customerId);

    Page<Order> getByCustomerId(Integer pageNum, Integer customerId);

    OrderShowOutDTO getById(Long orderId);
}

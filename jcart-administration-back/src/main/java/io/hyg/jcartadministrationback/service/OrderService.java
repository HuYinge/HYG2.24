package io.hyg.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.hyg.jcartadministrationback.dto.in.OrderSearchInDTO;
import io.hyg.jcartadministrationback.dto.out.OrderListOutDTO;
import io.hyg.jcartadministrationback.dto.out.OrderShipShowOutDTO;
import io.hyg.jcartadministrationback.dto.out.OrderShowOutDTO;
import io.hyg.jcartadministrationback.po.Order;

public interface OrderService {

    Page<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO, Integer pageNum);

    OrderShowOutDTO getById(Long orderId);

    void update(Order order);
}

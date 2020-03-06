package io.hyg.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.hyg.jcartadministrationback.dto.out.OrderListOutDTO;
import io.hyg.jcartadministrationback.dto.out.OrderShipShowOutDTO;
import io.hyg.jcartadministrationback.dto.out.OrderShowOutDTO;
import io.hyg.jcartadministrationback.po.Order;

public interface OrderService {

    Page<OrderListOutDTO> search(Integer pageNum);

    OrderShowOutDTO getById(Long orderId);

    void update(Order order);
}

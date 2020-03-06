package io.hyg.jcartadministrationback.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.hyg.jcartadministrationback.dao.OrderDetailMapper;
import io.hyg.jcartadministrationback.dao.OrderMapper;
import io.hyg.jcartadministrationback.dto.out.OrderListOutDTO;
import io.hyg.jcartadministrationback.dto.out.OrderShowOutDTO;
import io.hyg.jcartadministrationback.po.Customer;
import io.hyg.jcartadministrationback.po.Order;
import io.hyg.jcartadministrationback.po.OrderDetail;
import io.hyg.jcartadministrationback.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderDetailMapper orderDetailMapper;



    @Override
    public Page<OrderListOutDTO> search(Integer pageNum) {

        PageHelper.startPage(pageNum,10);
        Page<OrderListOutDTO> page = orderMapper.search();

        return page;
    }

    @Override
    public OrderShowOutDTO getById(Long orderId) {

        Order order = orderMapper.selectByPrimaryKey(orderId);
        OrderDetail orderDetail = orderDetailMapper.selectByPrimaryKey(orderId);

        OrderShowOutDTO orderShowOutDTO = new OrderShowOutDTO();
        orderShowOutDTO.setOrderId(orderId);
        orderShowOutDTO.setCustomerId(order.getCustomerId());

        return null;
    }
}

package io.hyg.jcartstoreback.service;

import io.hyg.jcartstoreback.po.OrderHistory;

import java.util.List;

public interface OrderHistoryService {

    List<OrderHistory> getByOrderId(Long orderId);
}

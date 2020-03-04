package io.hyg.jcartstoreback.service;

import io.hyg.jcartstoreback.dto.in.OrderCheckoutInDTO;

public interface OrderService {

    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO,
                  Integer customerId);
}

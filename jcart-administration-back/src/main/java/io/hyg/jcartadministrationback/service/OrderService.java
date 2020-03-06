package io.hyg.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.hyg.jcartadministrationback.dto.out.OrderListOutDTO;

public interface OrderService {

    Page<OrderListOutDTO> search(Integer pageNum);

}

package io.hyg.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.hyg.jcartstoreback.dto.out.ProductListOutDTO;
import io.hyg.jcartstoreback.dto.out.ProductShowOutDTO;

public interface ProductService {
    ProductShowOutDTO getById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);


}

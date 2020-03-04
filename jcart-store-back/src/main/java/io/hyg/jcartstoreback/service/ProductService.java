package io.hyg.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.hyg.jcartstoreback.dto.out.ProductListOutDTO;
import io.hyg.jcartstoreback.dto.out.ProductShowOutDTO;
import io.hyg.jcartstoreback.po.Product;

public interface ProductService {


    Product getById(Integer productId);

    ProductShowOutDTO getShowById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);


}

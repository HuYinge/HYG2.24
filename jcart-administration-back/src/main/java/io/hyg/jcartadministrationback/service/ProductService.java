package io.hyg.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.hyg.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.hyg.jcartadministrationback.dto.in.ProductSearchInDTO;
import io.hyg.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.hyg.jcartadministrationback.dto.out.ProductListOutDTO;
import io.hyg.jcartadministrationback.dto.out.ProductShowOutDTO;

import java.util.List;

public interface ProductService {
    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);

    Page<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                   Integer pageNum);

    ProductShowOutDTO getById(Integer productId);


}

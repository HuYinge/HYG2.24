package io.hyg.jcartstoreback.dao;

import com.github.pagehelper.Page;
import io.hyg.jcartstoreback.dto.out.ProductListOutDTO;
import io.hyg.jcartstoreback.po.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMapper {

    int deleteByPrimaryKey(Integer productId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);



    Page<ProductListOutDTO> search();

}

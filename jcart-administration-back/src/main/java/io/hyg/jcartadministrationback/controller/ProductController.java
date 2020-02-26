package io.hyg.jcartadministrationback.controller;

import io.hyg.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.hyg.jcartadministrationback.dto.in.ProductSearchInDTO;
import io.hyg.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.hyg.jcartadministrationback.dto.out.PageOutDTO;
import io.hyg.jcartadministrationback.dto.out.ProductListOutDTO;
import io.hyg.jcartadministrationback.dto.out.ProductShowOutDTO;
import io.hyg.jcartadministrationback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam Integer pageNum){




        return null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){

        return productService.create(productCreateInDTO);
    }

    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){

        productService.update(productUpdateInDTO);

    }



    @PostMapping("/delete")
    public void delete(@RequestBody Integer productId){
        productService.delete(productId);
    }

    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> productIds){
        productService.batchDelete(productIds);
    }



}

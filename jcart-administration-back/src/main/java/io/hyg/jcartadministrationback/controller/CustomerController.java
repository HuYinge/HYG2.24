package io.hyg.jcartadministrationback.controller;

import io.hyg.jcartadministrationback.dto.in.CustomerSearchInDTO;
import io.hyg.jcartadministrationback.dto.out.CustomerListOutDTO;
import io.hyg.jcartadministrationback.dto.out.CustomerShowOutDTO;
import io.hyg.jcartadministrationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {


    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(CustomerSearchInDTO customerSearchInDTO,
                                                 @RequestParam Integer pageNum){
        return null;
    }

//回显
    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId){
        return null;
    }


    //创建和添加
    @PostMapping("/disable")
    public void disable(@RequestParam Integer customerId){

    }







}

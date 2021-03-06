package io.hyg.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.hyg.jcartadministrationback.dto.in.CustomerSearchInDTO;
import io.hyg.jcartadministrationback.dto.in.CustomerSetStatusInDTO;
import io.hyg.jcartadministrationback.po.Customer;

public interface CustomerService {

     Page<Customer> search(CustomerSearchInDTO customerSearchInDTO, Integer pageNum);

     Customer getById(Integer customerId);


     void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);

}

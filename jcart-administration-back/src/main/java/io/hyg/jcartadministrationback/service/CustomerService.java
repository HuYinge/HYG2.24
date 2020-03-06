package io.hyg.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.hyg.jcartadministrationback.po.Customer;

public interface CustomerService {

     Page<Customer> search(Integer pageNum);

     Customer getById(Integer customerId);



}

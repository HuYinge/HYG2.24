package io.hyg.jcartstoreback.service;

import io.hyg.jcartstoreback.dto.in.CustomerRegisterInDTO;
import io.hyg.jcartstoreback.po.Customer;

public interface CustomerService {

    Integer register(CustomerRegisterInDTO customerRegisterInDTO);

    Customer getByUsername(String username);

    Customer getById(Integer customerId);

    void update(Customer customer);

}

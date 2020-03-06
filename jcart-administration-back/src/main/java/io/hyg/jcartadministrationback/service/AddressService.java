package io.hyg.jcartadministrationback.service;

import io.hyg.jcartadministrationback.po.Address;

import java.util.List;

public interface AddressService {

    Address getById(Integer addressId);

    List<Address> getByCustomerId(Integer customerId);
}

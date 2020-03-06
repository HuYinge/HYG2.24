package io.hyg.jcartadministrationback.service.impl;

import io.hyg.jcartadministrationback.dao.AddressMapper;
import io.hyg.jcartadministrationback.po.Address;
import io.hyg.jcartadministrationback.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public Address getById(Integer addressId) {
        Address address = addressMapper.selectByPrimaryKey(addressId);
        return address;
    }
}

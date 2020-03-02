package io.hyg.jcartadministrationback.service;

import io.hyg.jcartadministrationback.po.Administrator;

public interface AdministratorService {

    Administrator getById(Integer administratorId);

    Administrator getByUsername(String username);

    void update(Administrator administrator);

}

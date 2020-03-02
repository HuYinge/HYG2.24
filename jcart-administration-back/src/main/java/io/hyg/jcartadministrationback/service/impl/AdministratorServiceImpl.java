package io.hyg.jcartadministrationback.service.impl;
import io.hyg.jcartadministrationback.dao.AdministratorMapper;
import io.hyg.jcartadministrationback.po.Administrator;
import io.hyg.jcartadministrationback.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministratorServiceImpl implements AdministratorService {

    @Autowired
    private AdministratorMapper administratorMapper;



    @Override
    public Administrator getById(Integer administratorId) {
        Administrator administrator = administratorMapper.selectByPrimaryKey(administratorId);
        return administrator;
    }

    @Override
    public Administrator getByUsername(String username) {
      Administrator administrator = administratorMapper.selectByUsername(username);
        return administrator;

    }


    @Override
    public void update(Administrator administrator) {
        administratorMapper.updateByPrimaryKeySelective(administrator);

    }
}

package io.hyg.jcartstoreback.dao;

import io.hyg.jcartstoreback.po.Administrator;

public interface AdministratorMapper {

    int deleteByPrimaryKey(Integer administratorId);

    int insert(Administrator record);

    int insertSelective(Administrator record);

    Administrator selectByPrimaryKey(Integer administratorId);

    int updateByPrimaryKeySelective(Administrator record);

    int updateByPrimaryKey(Administrator record);
}

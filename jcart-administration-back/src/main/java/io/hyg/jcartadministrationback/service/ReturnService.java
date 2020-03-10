package io.hyg.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.hyg.jcartadministrationback.dto.in.ReturnSearchInDTO;
import io.hyg.jcartadministrationback.po.Return;

public interface ReturnService {

    Page<Return> search(ReturnSearchInDTO returnSearchInDTO, Integer pageNum);

    Return getById(Integer returnId);

    void update(Return aReturn);

}

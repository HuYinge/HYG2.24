package io.hyg.jcartadministrationback.controller;

import at.favre.lib.crypto.bcrypt.BCrypt;
import io.hyg.jcartadministrationback.constant.ClientExceptionConstant;
import io.hyg.jcartadministrationback.dto.in.*;
import io.hyg.jcartadministrationback.dto.out.*;
import io.hyg.jcartadministrationback.exception.ClientException;
import io.hyg.jcartadministrationback.po.Administrator;
import io.hyg.jcartadministrationback.service.AdministratorService;
import io.hyg.jcartadministrationback.util.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/administrator")
public class AdministraController {

    @Autowired
    private AdministratorService administratorService;

    @Autowired
    private JWTUtil jwtUtil;


    @GetMapping("/login")
    public AdministratorLoginOutDTO login(AdministratorLoginInDTO administratorLoginInDTO) throws ClientException{
        Administrator administrator = administratorService.getByUsername(administratorLoginInDTO.getUsername());
        if (administrator == null){
            throw new ClientException(ClientExceptionConstant.ADMINISTRATOR_USERNAME_NOT_EXIST_ERRCODE, ClientExceptionConstant.ADMINISTRATOR_USERNAME_NOT_EXIST_ERRMSG);
        }
        String encPwdDB = administrator.getEncryptedPassword();
        BCrypt.Result result = BCrypt.verifyer().verify(administratorLoginInDTO.getPassword().toCharArray(), encPwdDB);

        if (result.verified) {
            AdministratorLoginOutDTO administratorLoginOutDTO = jwtUtil.issueToken(administrator);
            return administratorLoginOutDTO;
        }else {
            throw new ClientException(ClientExceptionConstant.ADNINISTRATOR_PASSWORD_INVALID_ERRCODE, ClientExceptionConstant.ADNINISTRATOR_PASSWORD_INVALID_ERRMSG);
        }
    }
    @GetMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(@RequestParam(required = false) Integer adminstratorId){

        return null;
    }
    @PostMapping("/updateProdfile")
    public void updateProdfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO){


    }

    @GetMapping("/getPwdResetCode")
    public String getPwdResetCode(@RequestParam String email){
        return null;
    }

    @PostMapping("/resetPwd")
    public void resetPwd(@RequestBody AdministratorResetPwdInDTO administratorResetPwdInDTO){

    }

    @GetMapping("/getList")
    public PageOutDTO<AdministratorListOutDTO> getList(@RequestParam Integer pageNum){
        return null;
    }

    //回显的接口
    @GetMapping("/getById")
    public AdministratorShowOutDTO getById(@RequestParam Integer administratorId){
        return null;
    }

    //管理员添加页
    @PostMapping("/create")
    public Integer create(@RequestBody AdministratorCreateInDTO administratorCreateInDTO){
        return null;
    }


    //修改数据库
    @PostMapping("/update")
    public void update(@RequestBody AdministratorUpdateInDTO administratorUpdateInDTO){

    }

    @PostMapping("/delete")
    public void delete(@RequestBody Integer adminstratorId){

    }

    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> administratorIds){

    }



}

package io.hyg.jcartadministrationback.controller;

import io.hyg.jcartadministrationback.dto.in.AdministratorLoginInDTO;
import io.hyg.jcartadministrationback.dto.in.AdministratorResetPwdInDTO;
import io.hyg.jcartadministrationback.dto.in.AdministratorUpdateProfileInDTO;
import io.hyg.jcartadministrationback.dto.out.AdministratorGetProfileOutDTO;
import io.hyg.jcartadministrationback.dto.out.AdministratorListOutDTO;
import io.hyg.jcartadministrationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/administrator")
public class AdministraController {

    @GetMapping("/login")
    public String login(AdministratorLoginInDTO administratorLoginInDTO){

        return null;


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

    

}

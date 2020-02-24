package io.hyg.jcartadministrationback.controller;

import io.hyg.jcartadministrationback.dto.in.AdministratorLoginInDTO;
import io.hyg.jcartadministrationback.dto.in.AdministratorUpdateProfileInDTO;
import io.hyg.jcartadministrationback.dto.out.AdministratorGetProfileOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/administrator")
public class AdministraController {

    @GetMapping("/login")
    public String login(AdministratorLoginInDTO administratorLoginInDTO){

        return null;


    }
    @PostMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(Integer adminstratorId){

        return null;
    }
    @PostMapping("/updateProdfile")
    public void updateProdfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO){



    }
}

package com.imsisojib.portfolio.controllers;

import com.imsisojib.portfolio.interfaces.AccountService;
import com.imsisojib.portfolio.models.Profile;
import org.hibernate.annotations.common.util.impl.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.Console;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/")
    public String root(){
        return "Welcome. --Portfolio-- Sprint boot application is running.";
    }

    @GetMapping("/profileInfo")
    public String getProfileInfo(){
       try{
           return  accountService.getAccountInfo();
       }catch (Exception e){
           return e.getMessage();
       }
    }

    @PostMapping("/updateProfile")
    public String updateProfile(@RequestBody Profile profile){
        try{
            return  accountService.updateProfile(profile);
        }catch (Exception e){
            return e.getMessage();
        }
    }

}

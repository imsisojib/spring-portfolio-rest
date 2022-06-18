package com.imsisojib.portfolio.controllers;

import com.imsisojib.portfolio.interfaces.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

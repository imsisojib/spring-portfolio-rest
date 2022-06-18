package com.imsisojib.portfolio.services;

import com.imsisojib.portfolio.interfaces.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImp implements AccountService {
    @Override
    public String getAccountInfo() {
        return "Name: Md Sirajul Islam Sojib";
    }
}

package com.imsisojib.portfolio.services;

import com.imsisojib.portfolio.interfaces.AccountService;
import com.imsisojib.portfolio.models.Profile;
import com.imsisojib.portfolio.repositories.MyProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImp implements AccountService {

    @Autowired
    private MyProfileRepository myProfileRepository;

    @Override
    public String getAccountInfo() {

        List<Profile> profiles = myProfileRepository.findAll();

        if (profiles.size()>=1){
            //means profile found
            return profiles.get(0).getName();
        }else{
            //no profile found
            return "No profile found!";
        }
    }

    @Override
    public String updateProfile(Profile profile) {
        Profile savedProfile = myProfileRepository.saveAndFlush(profile);

        if (savedProfile.getId()==profile.getId()){
            return "Profile Updated Successfully.";
        }else{
            return  "Failed to update profile";
        }

    }
}

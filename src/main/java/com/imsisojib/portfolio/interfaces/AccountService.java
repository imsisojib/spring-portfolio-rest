package com.imsisojib.portfolio.interfaces;

import com.imsisojib.portfolio.models.Profile;

public interface AccountService{
    String getAccountInfo();

    String updateProfile(Profile profile);
}

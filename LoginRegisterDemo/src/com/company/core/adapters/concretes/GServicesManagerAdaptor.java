package com.company.core.adapters.concretes;

import com.company.GServicesManager.GUser;
import com.company.GServicesManager.GoogleManager;
import com.company.core.adapters.abstracts.GAuthService;
import com.company.entities.concretes.User;

public class GServicesManagerAdaptor implements GAuthService {

    @Override
    public User registerWithGoogle() {
        GoogleManager googleManager = new GoogleManager();
        GUser gUser = googleManager.register();
        User user = new User(10,gUser.getFirstName(),gUser.getLastName(),gUser.geteMail(),gUser.getPassword());
        return user;
    }
}

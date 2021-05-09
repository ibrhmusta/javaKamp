package com.company.business.abstracts;

import com.company.entities.concretes.User;

public interface AuthService {
    void register(User user);
    void login(User user);
    void verify(User user,String verifyLink);
    void loginWithGoogle();
}

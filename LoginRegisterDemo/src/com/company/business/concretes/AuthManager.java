package com.company.business.concretes;

import com.company.GServicesManager.GoogleManager;
import com.company.business.abstracts.AuthService;
import com.company.business.abstracts.UserService;
import com.company.core.adapters.abstracts.GAuthService;
import com.company.core.adapters.concretes.GServicesManagerAdaptor;
import com.company.entities.concretes.User;

public class AuthManager implements AuthService {
    private UserService userService;

    public AuthManager(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void register(User user) {
            userService.add(user);
            System.out.println("Kullanıcı kaydı başarılı : " + user.getFirstName() + " " + user.getLastName());
    }

    @Override
    public void login(User user) {
        User user1 = userService.getByMail(user.getEmail());
        if (!user.getPassword().isBlank()) {
            if (user1 != null && user.getPassword() == user1.getPassword()) {
                System.out.println("Kullanıcı girişi başarılı : " + user.getFirstName() + " " + user.getLastName());

            }
        }
        System.out.println("Şifreniz veya emailiniz hatalı!");
    }

    @Override
    public void loginWithGoogle() {
        GAuthService gAuthService = new GServicesManagerAdaptor();
        User user = gAuthService.registerWithGoogle();
        if (userService.getByMail(user.getEmail()) == null) {
            userService.add(user);
        }
        System.out.println("Google ile giriş başarılı!");
    }
}
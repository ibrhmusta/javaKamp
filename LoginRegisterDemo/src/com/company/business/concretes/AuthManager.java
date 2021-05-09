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
            generateVerificationCode(user);
    }

    @Override
    public void login(User user) {
        User tempUser = userService.getByMail(user.getEmail());
        if (!user.getPassword().isBlank()) {
            if (tempUser != null && user.getPassword().equals(tempUser.getPassword())) {
                System.out.println("Kullanıcı girişi başarılı : " + user.getFirstName() + " " + user.getLastName());
                return ;
            }
        }
        System.out.println("Şifreniz veya emailiniz hatalı!");
    }

    @Override
    public void verify(User user, String verifyLink) {
        User tempUser = userService.getById(user.getId());
        if(tempUser.getVerificationCode().equals(verifyLink)){
            tempUser.setVerify(true);
            System.out.println("Doğrulama başarılı");
            return;
        }
        System.out.println("Link geçersiz tekrar deneyin...");
    }

    @Override
    public void loginWithGoogle() {
        GAuthService gAuthService = new GServicesManagerAdaptor();
        User user = gAuthService.registerWithGoogle();
        if (userService.getByMail(user.getEmail()) == null) {
            userService.add(user);
        }
        user.setVerify(true);
        System.out.println("Google ile giriş başarılı!");
    }
    private void generateVerificationCode(User user){
        int rndIndex = (int)Math.floor(Math.random()*999999);
        String code = "https://gverify/user?verificationCode="+rndIndex;
        user.setVerificationCode(code);
    }
}
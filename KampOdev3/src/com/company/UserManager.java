package com.company;

public class UserManager {
    public void login(User user){
        //sadece giriş
        System.out.println("Kullanıcı girişi başarılı");
    }
    public void register(User user){
        System.out.println("Kayıt başarılı");
    }
    public void signOut(User user){
        System.out.println("Çıkış başarılı");
    }
}

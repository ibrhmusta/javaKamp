package com.company;

public class InstructorManager extends UserManager {
    @Override
    public void login(User user){
        System.out.println("Kullanıcı girişi başarılı-Öğretmen");
    }

}

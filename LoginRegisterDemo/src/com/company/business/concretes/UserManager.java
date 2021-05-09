package com.company.business.concretes;

import com.company.business.abstracts.UserService;
import com.company.dataAccess.abstracts.UserDao;
import com.company.dataAccess.concretes.HibernateUserDao;
import com.company.entities.concretes.User;

import java.util.List;
import java.util.regex.Pattern;

public class UserManager implements UserService {
    private UserDao userDao;

    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    private static final String eMail_Pattern = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";


    @Override
    public void add(User user) {
        if(isUserValid(user)){
            System.out.println("Kullanıcı eklendi");
            userDao.add(user);
        }
        System.out.println("Kullanıcı ekleme işlemi başarısız");
    }

    @Override
    public User getByMail(String email) {
        return userDao.getByEmail(email);
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    private boolean isUserValid(User user){
        Pattern pattern = Pattern.compile(eMail_Pattern,Pattern.CASE_INSENSITIVE);
        if(pattern.matcher(user.getEmail()).find()&&user.getPassword().length()>6
                &&user.getFirstName().length()>2&&user.getLastName().length()>2&&getByMail(user.getEmail())==null){
            return true;
        }
        return false;
    }
}


package com.company.dataAccess.concretes;

import com.company.dataAccess.abstracts.UserDao;
import com.company.entities.concretes.User;

import java.util.List;

public class HibernateUserDao implements UserDao {
    @Override
    public void add(User user) {
        System.out.println("Eklenen kullanıcı : "+ user.getFirstName() +" "+ user.getLastName());
    }

    @Override
    public void update(User user) {
        System.out.println("Güncellenen kullanıcı : "+ user.getFirstName() +" "+ user.getLastName());
    }

    @Override
    public void delete(User user) {
        System.out.println("Silinen kullanıcı : "+ user.getFirstName() +" "+ user.getLastName());
    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public User getByEmail(String email) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}

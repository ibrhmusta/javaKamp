package com.company.dataAccess.concretes.inMemory;

import com.company.dataAccess.abstracts.UserDao;
import com.company.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class inMemoryUser implements UserDao {

    List<User> users = new ArrayList<>();

    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public void update(User user) {
        User user1 = get(user.getId());
        user1.setFirstName(user.getFirstName());
        user1.setLastName(user.getLastName());
        user1.setEmail(user.getEmail());
        user1.setPassword(user.getPassword());
    }

    @Override
    public void delete(User user) {
        User user1 = get(user.getId());
        users.remove(user1);
    }

    @Override
    public User get(int id) {
       for(User user:users){
            if(user.getId()==id){
                return user;
            }
       }
       return null;
    }

    @Override
    public User getByEmail(String email) {
        for(User user:users){
            if(user.getEmail().equals(email)){
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return users;
    }
}

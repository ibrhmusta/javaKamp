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
        User tempUser = get(user.getId());
        tempUser.setFirstName(user.getFirstName());
        tempUser.setLastName(user.getLastName());
        tempUser.setEmail(user.getEmail());
        tempUser.setPassword(user.getPassword());
    }

    @Override
    public void delete(User user) {
        User tempUser = get(user.getId());
        users.remove(tempUser);
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

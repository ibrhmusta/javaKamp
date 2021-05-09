package com.company.business.abstracts;

import com.company.entities.concretes.User;

import java.util.List;

public interface UserService {
    void add(User user);
    User getByMail(String email);
    List<User> getAll();
}

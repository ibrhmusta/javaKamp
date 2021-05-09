package com.nLayeredDemo.business.abstracts;

import com.nLayeredDemo.entities.concretes.Category;

import java.util.List;

public interface CategoryService {
    void add(Category category);
    List<Category> getAll();
}

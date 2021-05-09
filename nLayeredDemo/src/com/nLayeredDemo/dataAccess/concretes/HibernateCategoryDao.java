package com.nLayeredDemo.dataAccess.concretes;

import com.nLayeredDemo.dataAccess.abstracts.CategoryDao;
import com.nLayeredDemo.entities.concretes.Category;

import java.util.List;

public class HibernateCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile eklenen kategori : "+category.getName());
    }

    @Override
    public void update(Category category) {
        System.out.println("Hibernate ile güncellenen kategori : "+category.getName());
    }

    @Override
    public void delete(Category category) {
        System.out.println("Hibernate ile silinen kategori : "+category.getName());
    }

    @Override
    public Category get(int id) {
        return null;
    }

    @Override
    public List<Category> getAll() {
        return null;
    }
}

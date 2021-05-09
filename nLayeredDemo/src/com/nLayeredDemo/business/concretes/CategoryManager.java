package com.nLayeredDemo.business.concretes;

import com.nLayeredDemo.business.abstracts.CategoryService;
import com.nLayeredDemo.dataAccess.abstracts.CategoryDao;
import com.nLayeredDemo.entities.concretes.Category;

import java.util.List;

public class CategoryManager implements CategoryService {

    private CategoryDao categoryDao;

    public CategoryManager(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public void add(Category category) {
        this.categoryDao.add(category);
    }

    @Override
    public List<Category> getAll() {
        return null;
    }
}

package com.nLayeredDemo.dataAccess.abstracts;

import com.nLayeredDemo.entities.concretes.Category;
import java.util.List;

public interface CategoryDao {
    void add(Category category);
    void update(Category category);
    void delete(Category category);
    Category get(int id);
    List<Category> getAll();
}

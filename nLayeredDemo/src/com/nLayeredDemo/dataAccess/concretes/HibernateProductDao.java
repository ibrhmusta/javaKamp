package com.nLayeredDemo.dataAccess.concretes;

import com.nLayeredDemo.dataAccess.abstracts.ProductDao;
import com.nLayeredDemo.entities.concretes.Product;

import java.util.List;

public class HibernateProductDao implements ProductDao {

    @Override
    public void add(Product product) {
        System.out.println("Hibernate ile eklenen ürün : "+ product.getName());
    }

    @Override
    public void update(Product product) {
        System.out.println("Hibernate ile güncellenen ürün : "+ product.getName());
    }

    @Override
    public void delete(Product product) {
        System.out.println("Hibernate ile silinen ürün : "+ product.getName());
    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}

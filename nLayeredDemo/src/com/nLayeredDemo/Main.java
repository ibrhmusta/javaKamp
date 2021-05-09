package com.nLayeredDemo;

import com.nLayeredDemo.business.abstracts.ProductService;
import com.nLayeredDemo.business.concretes.ProductManager;
import com.nLayeredDemo.core.JLoggerManagerAdapter;
import com.nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import com.nLayeredDemo.entities.concretes.Product;

public class Main {

    public static void main(String[] args) {
        //ToDo: Spring IoC ile çözülecek
        ProductService productService = new ProductManager(new HibernateProductDao(),new JLoggerManagerAdapter());

        Product product = new Product(1,2,"Elma",12,50);
        productService.add(product);
    }
}

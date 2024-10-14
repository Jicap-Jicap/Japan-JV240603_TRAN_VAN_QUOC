package com.ra.model.dao.product;

import com.ra.model.entity.Category;
import com.ra.model.entity.Product;
import com.ra.model.entity.Product;

import java.util.List;

public interface ProductDAO {
    List<Product> findAll();
    boolean create(Product product);
    Product findById(int id);
    boolean update(Product product);
    void delete(int id);

}

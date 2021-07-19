package com.how2java.tmall.service;

import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.util.Page;

import java.util.List;

public interface CategoryService {
    List<Category> list();
    int total();

    void delete(int id);

    void add(Category category);

    Category get(int id);

    void update(Category category);

}

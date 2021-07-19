package com.how2java.tmall.mapper;

import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.util.Page;

import java.util.List;

public interface CategoryMapper {
//    List <Category> list(Page page);
    List<Category> list();

    public int total();

    void delete(Integer id);

    void add(Category category);

    Category get(int id);

    void update(Category category);
}

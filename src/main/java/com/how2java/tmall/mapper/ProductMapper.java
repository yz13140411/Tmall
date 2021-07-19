package com.how2java.tmall.mapper;


import com.how2java.tmall.pojo.Product;
import com.how2java.tmall.pojo.ProductExample;

import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List  selectByExample(ProductExample example);
}
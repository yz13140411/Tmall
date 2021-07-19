package com.how2java.tmall.pojo;

import lombok.Data;

@Data
public class Property {
    private Integer id;
    private  Integer cid;
    private String name;

    private Category category;
}

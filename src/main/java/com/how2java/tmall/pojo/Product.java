package com.how2java.tmall.pojo;

import lombok.Data;
import java.util.Date;

@Data
public class Product {

  private Integer id;

  private String name;

  private String subTitle;

  private Float originalPrice;

  private Float promotePrice;

  private Integer stock;

  private Integer cid;

  private Date createDate;

  private Category category;




}

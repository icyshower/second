package com.second.mall.modules.shopping.entity;

import javax.persistence.*;

/**
 * @ClassName IndentProduct
 * @Author icy
 * @Data 2020/12/31 14:51
 * @Version v1.0
 **/
@Entity
@Table(name = "indent_product")
public class IndentProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int indentProductId;
    private int productId;
    private int indentId;

}

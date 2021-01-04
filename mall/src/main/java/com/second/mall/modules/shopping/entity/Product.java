package com.second.mall.modules.shopping.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @ClassName Product
 * @Author icy
 * @Data 2020/12/29 20:27
 * @Version v1.0
 **/
@Entity
@Table(name = "product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String productName;
    private double productPrice;
    private int discount;
    private int shopId;
    private String describe;//描述
    private LocalDateTime createTime;
    private LocalDateTime updateTime;



}

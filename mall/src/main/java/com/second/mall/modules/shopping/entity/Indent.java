package com.second.mall.modules.shopping.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @ClassName Indent
 * @Author icy
 * @Data 2020/12/31 14:42
 * @Version v1.0
 **/
@Entity
@Table(name = "indent")
@Data
public class Indent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int indentId;
    private String productName;
    private int productNumber;
    private int userId;
    private int addressId;
    private double indentPrice;
    private LocalDateTime createTime;
    private int state;

}

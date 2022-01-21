package com.shop.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * 商品实体
 *
 * @author Mr.Lan
 * @create: 2022-01-21 14:25
 */
@Data
@Entity
@Table(name = "tb_product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;

    private Integer status;

    private BigDecimal price;

    private String productDesc;

    private String caption;

}

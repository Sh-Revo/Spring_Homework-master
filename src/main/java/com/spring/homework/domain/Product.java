package com.spring.homework.domain;

import lombok.Data;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    @Column(name = "product_name")
    private String name;

    @Column(name = "product_price")
    private BigDecimal price;

    @ManyToOne(optional = false, cascade = CascadeType.MERGE, fetch= FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;


}

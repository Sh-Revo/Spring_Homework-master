package com.spring.homework.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Data
@RequiredArgsConstructor
public class ProductDTO {

    private Long id;

    private String name;

    private BigDecimal price;

    private Long companyId;
}

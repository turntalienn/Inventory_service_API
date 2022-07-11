package com.turntalien.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse { //for decoupling model and dto entities
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
package edu.cafe.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Product {
    private String id;
    private String name;
    private Double unitPrice;
    private Integer quantity;
}

package com.shopping.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {

    private int id;
    private String productName;
    private Category category;
    private float price;
    private int quantity;

}

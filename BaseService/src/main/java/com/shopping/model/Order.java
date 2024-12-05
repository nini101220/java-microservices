package com.shopping.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    private Long id;
    @NonNull
    private Long customerId;
    @NonNull
    private Long productId;
    private int productCount;
    private int price;
    private String status;

}

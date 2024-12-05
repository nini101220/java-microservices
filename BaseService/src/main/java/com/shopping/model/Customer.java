package com.shopping.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {

    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private long mobileNo;
    private int count;

}

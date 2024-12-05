CREATE TABLE Customer (
    id int,
    LastName varchar(255),
    FirstName varchar(255),
    Address varchar(255),
    City varchar(255),
    MobileNo long,
    orderCount int
);



CREATE TABLE Product (
    id int,
    productName varchar(255),
    Category varchar(255),
    price float,
    Quantity int
    );
    
    
    
CREATE TABLE order_ (
    id int,
    customerId int,
    productId int,
    price  float,
    productCount int,
    status varchar(255)
    );

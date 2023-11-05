package com.saga.choreography.entity;

import javax.persistence.*;

@Entity(name = "Products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;

    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private Long category_id; // You may want to use Category entity with a @ManyToOne relationship

    @Column(nullable = false)
    private Integer stock_quantity;

    // Constructors, getters, and setters

    public Products() {
    }

    public Products(String name, String description, Double price, Long category_id, Integer stock_quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category_id = category_id;
        this.stock_quantity = stock_quantity;
    }

    // Getters and setters

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public Integer getStock_quantity() {
        return stock_quantity;
    }

    public void setStock_quantity(Integer stock_quantity) {
        this.stock_quantity = stock_quantity;
    }
}

package com.example.backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * This class will be responsible for the marketplace listing
 * It's an entity, meaning it will be stored in the database
 */

@Entity
public class Listing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    private Double price;
    private String category;
    private String status;

    protected Listing(){}

    public Listing(String title, String description, Double price, String category, String status){
        this.title = title;
        this.description = description;
        this.price = price;
        this.category = category;
        this.status = status;
    }


}

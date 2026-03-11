package com.example.backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * This class will be responsible for the marketplace listing
 * It's an entity, meaning it will be stored in the database, not considered one of the layers
 */

@Entity
public class Listing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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

    public Long getId(){
        return this.id;
    }

    public String getTitle(){
        return this.title;
    }

    public String getDescription(){
        return this.description;
    }

    public Double getPrice(){
        return this.price;
    }

    public String getCategory(){
        return this.category;
    }

    public String getStatus(){
        return this.status;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setStatus(String status){
        this.status = status;
    }

}

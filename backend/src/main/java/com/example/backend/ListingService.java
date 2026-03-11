package com.example.backend;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * Business logic layer
 * Handles our logic e.g. "listing can't have negative price"
 * or "only seller can delete listing"
 */

@Service //tells spring to manage this as a bean
public class ListingService {
    
    private final ListingRepository listingRepository;

    //Spring sees this constructor and automatically injects, so instead of 
    // creating object and passing it to constructor, spring creates and manages them and just hands
    //them around
    // the repository for us (dependency injection)
    public ListingService(ListingRepository listingRepository){
        this.listingRepository = listingRepository;
    }

    //the actual logic - go get all listings from the DB
    public List<Listing> getAllListings(){
        return listingRepository.findAll();
    }
}

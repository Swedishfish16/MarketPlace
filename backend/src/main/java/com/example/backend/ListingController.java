package com.example.backend;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is controller layer
 * handles HTTP requests for us
 */

@RestController // this handles HTTP requests and returns json
@RequestMapping("api/v1/listings") // base url for all endpoints in this class
public class ListingController {
    
    private final ListingService listingService;

    //same thing - spring injects the service automatically
    public ListingController(ListingService listingService){
        this.listingService = listingService;
    }

    // calls the getAllListings from the service layer
    @GetMapping //when someone sends a GET request to api/v1/listings
    public List<Listing> getListing(){
        return listingService.getAllListings(); //ask service, then return result as JSON
    }

    // calls createListing from service layer
    @PostMapping
    public Listing createListing(@RequestBody Listing listing){
        return listingService.createListing(listing);
    }



}


//controller calls service -> service calls repository -> repository calls database
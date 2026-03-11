package com.example.backend;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository is the Data Access Layer
 * Repository is simply for interracting with the database and that's all
 * Only add custom database queries here as JPA handles them for us
 */
public interface ListingRepository extends JpaRepository<Listing, Long> {
    
}

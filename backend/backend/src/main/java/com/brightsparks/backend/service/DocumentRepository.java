package com.brightsparks.backend.service;

import com.brightsparks.backend.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
    // You can add custom query methods here if needed
}
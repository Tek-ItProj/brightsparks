package com.brightsparks.backend.repository;

import com.brightsparks.backend.model.PeerReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeerReviewRepository extends JpaRepository<PeerReview, Long> {
    List<PeerReview> findByDocumentId(Long documentId); // Custom query method
}
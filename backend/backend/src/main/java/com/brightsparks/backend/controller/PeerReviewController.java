package com.brightsparks.backend.controller;


import com.brightsparks.backend.model.Document;
import com.brightsparks.backend.model.PeerReview;
import com.brightsparks.backend.service.DocumentService;
import com.brightsparks.backend.service.PeerReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/peer-reviews")
public class PeerReviewController {

    private final PeerReviewService peerReviewService;
    private final DocumentService documentService;

    @Autowired
    public PeerReviewController(PeerReviewService peerReviewService, DocumentService documentService) {
        this.peerReviewService = peerReviewService;
        this.documentService = documentService;
    }

    @PostMapping("/documents/{documentId}")
    public ResponseEntity<PeerReview> createPeerReview(
            @PathVariable Long documentId,
            @RequestBody PeerReview peerReview) {

        Optional<Document> documentOptional = documentService.getDocumentById(documentId);
        if (documentOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        Document document = documentOptional.get();
        peerReview.setDocument(document);
        //peerReview.setDocument(document);

        PeerReview createdPeerReview = peerReviewService.createPeerReview(peerReview);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPeerReview);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PeerReview> getPeerReviewById(@PathVariable Long id) {
        Optional<PeerReview> peerReviewOptional = peerReviewService.getPeerReviewById(id);
        return peerReviewOptional.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/documents/{documentId}")
    public ResponseEntity<List<PeerReview>> getPeerReviewsByDocumentId(@PathVariable Long documentId) {

        Optional<Document> documentOptional = documentService.getDocumentById(documentId);
        if (documentOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        List<PeerReview> peerReviews = peerReviewService.getPeerReviewsByDocumentId(documentId);
        return ResponseEntity.ok(peerReviews);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PeerReview> updatePeerReview(@PathVariable Long id, @RequestBody PeerReview updatedPeerReview) {
        if (!peerReviewService.getPeerReviewById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        updatedPeerReview.setId(id);
        PeerReview updatedReview = peerReviewService.updatePeerReview(updatedPeerReview);
        return ResponseEntity.ok(updatedReview);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePeerReview(@PathVariable Long id) {
        if (!peerReviewService.getPeerReviewById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        peerReviewService.deletePeerReview(id);
        return ResponseEntity.noContent().build();
    }
}
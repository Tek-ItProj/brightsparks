package com.brightsparks.backend.service;

import com.brightsparks.backend.model.PeerReview;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PeerReviewService {

    private final PeerReviewRepository peerReviewRepository;

    @Autowired
    public PeerReviewService(PeerReviewRepository peerReviewRepository) {
        this.peerReviewRepository = peerReviewRepository;
    }

    public Optional<PeerReview> getPeerReviewById(Long id) {
        return peerReviewRepository.findById(id);
    }

    public PeerReview createPeerReview(PeerReview peerReview) {
        return peerReviewRepository.save(peerReview);
    }

    public PeerReview updatePeerReview(PeerReview peerReview) {
        return peerReviewRepository.save(peerReview);
    }

    public void deletePeerReview(Long id) {
        peerReviewRepository.deleteById(id);
    }

    public List<PeerReview> getPeerReviewsByDocumentId(Long documentId) {
        return peerReviewRepository.findByDocumentId(documentId);
    }
}
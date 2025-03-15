package com.brightsparks.backend.controller;

import com.brightsparks.backend.model.Document;
import com.brightsparks.backend.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final DocumentService postService;

    @Autowired
    public PostController(DocumentService postService) {
        this.postService = postService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Document> getPostById(@PathVariable Long id) {
        Optional<Document> postOptional = postService.getDocumentById(id);
        return postOptional.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Add other endpoints as needed (e.g., get all posts, search posts)
}
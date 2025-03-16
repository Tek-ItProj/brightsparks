package com.brightsparks.backend.controller;

import com.brightsparks.backend.model.Community;
import com.brightsparks.backend.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/communities")
public class CommunityController {

    @Autowired
    private CommunityService communityService;

    // Get all communities
    @GetMapping("/all")
    public ResponseEntity<List<Community>> getAllCommunities() {
        List<Community> communities = communityService.getAllCommunities();
        return new ResponseEntity<>(communities, HttpStatus.OK);
    }

    // Get a community by ID
    /*@GetMapping("/{id}")
    public ResponseEntity<Community> getCommunityById(@PathVariable Long id) {
        Optional<Community> community = communityService.getCommunityById(id);
        return community.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }*/

    // Create a new community
    /*@PostMapping
    public ResponseEntity<Community> createCommunity(@RequestBody Community community) {
        Community savedCommunity = communityService.saveCommunity(community);
        return new ResponseEntity<>(savedCommunity, HttpStatus.CREATED);
    }*/



    // Delete a community
    /*@DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteCommunity(@PathVariable Long id) {
        if (!communityService.getCommunityById(id).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        communityService.deleteCommunity(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }*/
}
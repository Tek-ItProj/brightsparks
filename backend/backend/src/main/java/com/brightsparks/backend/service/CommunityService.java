package com.brightsparks.backend.service;

import com.brightsparks.backend.model.Community;
import com.brightsparks.backend.repository.CommunityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommunityService {

    @Autowired
    private CommunityRepository communityRepository;

    public List<Community> getAllCommunities() {
        return communityRepository.findAll();
    }


    public List<Community> findCommunitiesBySubject(String subject) {
        return communityRepository.findBySubject(subject);
    }

    public List<Community> findCommunitiesByGradeLevel(String gradeLevel) {
        return communityRepository.findByGradeLevel(gradeLevel);
    }



}
package com.brightsparks.backend.repository;

import com.brightsparks.backend.model.Community;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommunityRepository extends JpaRepository<Community, Long> {
    List<Community> findBySubject(String subject);


    List<Community> findByGradeLevel(String gradeLevel);
}
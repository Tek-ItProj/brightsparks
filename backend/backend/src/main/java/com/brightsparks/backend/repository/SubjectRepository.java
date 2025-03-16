package com.brightsparks.backend.repository;

import com.brightsparks.backend.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

    // Find subject by name
    Optional<Subject> findByName(String name);
}
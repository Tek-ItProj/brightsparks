package com.brightsparks.backend.service;


import com.brightsparks.backend.model.Subject;
import com.brightsparks.backend.repository.SubjectRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service

public class   SubjectService {

    private final SubjectRepository subjectRepository;

    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public Optional<Subject> getSubjectByName(String name) {
        return subjectRepository.findByName(name);
    }
}


package com.brightsparks.backend.controller;

import com.brightsparks.backend.model.Subject;
import com.brightsparks.backend.service.SubjectService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/subjects")

public class SubjectController {

    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }


    @GetMapping("/{name}")
    public Optional<Subject> getSubjectByName(@PathVariable String name) {
        return subjectService.getSubjectByName(name);
    }
}


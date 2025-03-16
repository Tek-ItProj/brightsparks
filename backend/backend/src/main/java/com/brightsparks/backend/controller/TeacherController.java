package com.brightsparks.backend.controller;

import com.brightsparks.backend.model.Teacher;
import com.brightsparks.backend.service.TeacherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/available/{subject}")
    public List<Teacher> getAvailableTeachers(@PathVariable String subject) {
        return teacherService.getAvailableTeachersForSubject(subject);
    }
}
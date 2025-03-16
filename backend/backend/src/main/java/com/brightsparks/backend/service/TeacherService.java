package com.brightsparks.backend.service;



import com.brightsparks.backend.model.Teacher;
import com.brightsparks.backend.repository.TeacherRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<Teacher> getAvailableTeachersForSubject(String subjectName) {
        return teacherRepository.findAvailableTeachersBySubject(subjectName);
    }
}

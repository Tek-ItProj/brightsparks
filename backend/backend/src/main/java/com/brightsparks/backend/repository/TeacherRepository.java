package com.brightsparks.backend.repository;



import com.brightsparks.backend.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {


    List<Teacher> findByIsAvailableTrue();


    @Query("SELECT t FROM Teacher t JOIN t.subjects s WHERE s.name = :subjectName AND t.isAvailable = TRUE")
    List<Teacher> findAvailableTeachersBySubject(@Param("subjectName") String subjectName);
}
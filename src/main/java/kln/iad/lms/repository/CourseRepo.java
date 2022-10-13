package kln.iad.lms.repository;

import kln.iad.lms.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CourseRepo extends JpaRepository<Course, String> {
}

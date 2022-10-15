package kln.iad.lms.repository;

import kln.iad.lms.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepo extends JpaRepository<Enrollment, String> {
}

package kln.iad.lms.service;

import kln.iad.lms.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentService extends JpaRepository<Enrollment, Long> {
}

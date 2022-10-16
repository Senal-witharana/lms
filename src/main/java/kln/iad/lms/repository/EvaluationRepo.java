package kln.iad.lms.repository;

import kln.iad.lms.entity.CourseEvaluation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluationRepo extends JpaRepository<CourseEvaluation, Long> {
}

package kln.iad.lms.service;

import kln.iad.lms.dto.CreateEvaluationDto;
import kln.iad.lms.entity.CourseEvaluation;

import java.util.Optional;

public interface EvaluationService  {

    Optional<CourseEvaluation> makeEvaluation(CreateEvaluationDto evaluationInfo) throws Exception;

}

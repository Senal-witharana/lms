package kln.iad.lms.controller;

import kln.iad.lms.dto.CreateEvaluationDto;
import kln.iad.lms.entity.CourseEvaluation;
import kln.iad.lms.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/Evaluation")
public class CourseEvaluationController {

    @Autowired
    EvaluationService evaluationService;

    @PostMapping("/save")
    public ResponseEntity<Optional<CourseEvaluation>> saveEvaluation(@RequestBody CreateEvaluationDto evaluationDto) {
        try {
            Optional<CourseEvaluation> savedEvaluation = evaluationService.makeEvaluation(evaluationDto);
            if(savedEvaluation.isPresent()) {
                return new ResponseEntity<>(savedEvaluation, HttpStatus.CREATED);
            } else {
                return new ResponseEntity<>(Optional.empty(), HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(Optional.empty(), HttpStatus.BAD_REQUEST);
        }
    }
}

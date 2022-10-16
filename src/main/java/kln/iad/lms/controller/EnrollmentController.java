package kln.iad.lms.controller;

import kln.iad.lms.dto.CreateEnrollmentDto;
import kln.iad.lms.entity.Enrollment;
import kln.iad.lms.service.EnrollmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/Enrollment")
public class EnrollmentController {
    @Autowired
    private EnrollmentServiceImpl enrollmentService;

    @GetMapping("/getEnrolledCourse")
    public ResponseEntity<Iterable<Enrollment>> getAllEnrollments() {
        return new ResponseEntity<>(enrollmentService.getAllEnrollments(), HttpStatus.ACCEPTED);
    }

    @GetMapping("{enrollmentId}")
    public ResponseEntity<Optional<Enrollment>> getEnrollmentById(@PathVariable Long enrollmentId) {
        Optional<Enrollment> enrollment = enrollmentService.getEnrollmentById(enrollmentId);

        if(enrollment.isEmpty()) {
            return new ResponseEntity<>(enrollment, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(enrollment, HttpStatus.ACCEPTED);
    }

//    @PostMapping("")
//    public ResponseEntity<Optional<Enrollment>> saveEnrollment(CreateEnrollmentDto enrollmentInfo) {
//        Optional<Enrollment> savedEnrollment = enrollmentService.saveEnrollment(enrollmentInfo);
//
//        if(savedEnrollment.isEmpty()) {
//            return new ResponseEntity<>(savedEnrollment, HttpStatus.BAD_REQUEST);
//        }
//        return new ResponseEntity<>(savedEnrollment, HttpStatus.CREATED);
//    }

}

package kln.iad.lms.controller;

import kln.iad.lms.dto.CreateEnrollmentDto;
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

    @PostMapping("/enrolCourse")
    public CreateEnrollmentDto enrollCourse(@RequestBody CreateEnrollmentDto createEnrollmentDto){
        System.out.println("Enrollment Success!");
        return enrollmentService.saveStudentEnrolledCourse(createEnrollmentDto);
    }

    @GetMapping("/registeredCourses")
    public List<CreateEnrollmentDto> getRegisteredCourses() {
        return enrollmentService.getEnrolledCourses();
    }

    @DeleteMapping("/dropCourse")
    public boolean dropCourse(@RequestBody CreateEnrollmentDto courseEnrollmentDTO){
        return enrollmentService.dropCourse(courseEnrollmentDTO);
    }

}

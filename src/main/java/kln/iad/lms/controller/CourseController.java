package kln.iad.lms.controller;

import kln.iad.lms.dto.CreateCourseDto;
import kln.iad.lms.dto.DeleteCourseDto;
import kln.iad.lms.entity.Course;
import kln.iad.lms.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/course")
@CrossOrigin
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/findAllCourses")
    public ResponseEntity<Iterable<Course>> getAllCourses() {

        return new ResponseEntity<>(courseService.getAllCourses(), HttpStatus.ACCEPTED);
    }

    @PostMapping("/addCourse")
    public ResponseEntity addCourse(@RequestBody CreateCourseDto createCourseDto){

        return ResponseEntity.status(HttpStatus.OK).body(courseService.saveCourse(createCourseDto));
    }

    @PutMapping("update")
    public ResponseEntity updateCourse(@RequestBody CreateCourseDto createCourseDto){

        return ResponseEntity.status(HttpStatus.OK).body(courseService.updateCourse(createCourseDto));
    }

    @DeleteMapping("deleteCourse")
    public ResponseEntity deleteCourse(@RequestBody DeleteCourseDto deleteCourseDto) {
        return ResponseEntity.status(HttpStatus.OK).body(courseService.deleteCourse(deleteCourseDto));
    }
}
